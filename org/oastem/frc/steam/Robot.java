package org.oastem.frc.steam;


import org.oastem.frc.C;
import org.oastem.frc.LogitechGamingPad;
import org.oastem.frc.control.TalonDriveSystem;
import org.oastem.frc.motion.LeftCase2;
import org.oastem.frc.motion.MotionProfileExample;
import org.oastem.frc.motion.RightCase2;
import org.oastem.frc.motion.StraightCase1;
import org.oastem.frc.sensor.LVMaxSonarEZUltrasonic;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.cscore.AxisCamera;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	// Drive System
	//A: drive system is going to be iterative, there were other 2 but forgot the names
	private TalonDriveSystem talonDrive = TalonDriveSystem.getInstance();
		
	//Motors
	//A: initializes the drive motors for each side as well as the conveyor and winch motor
	//A: assuming that the "backs" are masters to the "fronts" which will follow
	private CANTalon backLeft; //masters for mp
	private CANTalon backRight; //masters for mp 
	private Talon conveyorMotor;
	private Talon winchMotor;
	
	//Motion Profile Examples
	//A: initializes the left and right courses for motion profiling?
	private MotionProfileExample leftProfile;
	private MotionProfileExample rightProfile; 
	
	//Camera Objects
	//A: Initializes the cameras. Assuming CameraServer has something to do with the footage being sent to the network
	private CameraServer server;
	private AxisCamera visionCamera;
	private UsbCamera usbCamera;
	
	//Camera Values
	//A: initializes some x and y coordinates of the camera? assuming it's commented because we didn't use it
	/*private double[] defaultValue = new double[0];
	private double[] centerY;
	private double[] centerX;
	private double centerXCoor = 0;
	
	//Sensors
	//A: initializes the "Ultrasonic" sensor with the weird voltage to inches conversions in its file
	private LVMaxSonarEZUltrasonic sonicSensor;
	*/
	
	//Joystick 
	//A: initializes the gaming pad functions involving the analog stick, Dpad, bumpers/triggers, and letter buttons
	private LogitechGamingPad pad;
		
    //Joystick commands
	private boolean eStop1Pressed; //A: emergency stop button
	//private boolean reverseDirectionPressed;
	//private boolean reverseDirectionToggle;
	private boolean conveyorPressed; //A: detects if the conveyor motor is on or off
	private boolean conveyorToggle; //A: detects the button which toggles the conveyor on and off
	private boolean upDPadToggle; //A: detects the toggle on the up button on the Dpad?
	private boolean downDPadToggle; //A: detects the toggle on the down button on the Dpad?
	//private boolean winchToggle; //A: detects the button which toggles the winch on and off
	//private boolean winchPressed; //A: detects whether or not the winch is running? idk
	private boolean slowPressed; //A: detects if the slow function of the conveyor motor is on or off
	private boolean slowToggle; //A: detects the button which toggles the the slow function of the conveyor on or off
	
	//Joystick helpers
	private boolean stop; //A: detects whether stop button is on or off
	//private boolean reverseOrNah;
	private boolean conveyorOrNah; //A: detects whether conveyor is on or off
	private boolean slowOrNah; //A: detects whether slow function of the conveyor is on or off
	//private boolean winchOrNah;
		
	// Network Table
	private NetworkTable table; //A: initializes the network table, which calculates x and y values from the camera
	
	//PDP
	private PowerDistributionPanel pdp; //A: initializes the PDP, which i'm guessing specifies how much power to send to where
		
	//Timer
	private Timer timer;  //A: initializes timer
	
	//Robot Preferences --> Used for testing
	private Preferences prefs;
	
	//Autonomous State
	int autonomousCase = C.Auto.SELF_CORRECT_DRIVE; //A: a integer used to correct autonomous if it goes off course?
	final String case1Auto = "Straight"; //A: labels case1 for going straight
	final String case2Auto = "Left"; //A: labels case2 for going left
	final String case3Auto = "Right"; //A: labels case3 for going right
	SendableChooser<String> chooser; //A: Allows user to choose which case to operate by entering "Straight", "Left" or "Right"
	String autoSelected;
	
	boolean start = false; //A: Makes sure the robot starts out inactive 

	
	public Robot() {
        //initialize Drive System
		//A: initializes the 4 drive systems, values such as enc:rev and wheel diameter, and the gyroscope
		talonDrive.initializeTalonDrive(C.Port.FRONT_LEFT_CAN_DRIVE, C.Port.BACK_LEFT_CAN_DRIVE,
				C.Port.FRONT_RIGHT_CAN_DRIVE, C.Port.BACK_RIGHT_CAN_DRIVE, C.Drive.DRIVE_ENC_PULSE_PER_REV,
				C.Drive.DRIVE_WHEEL_DIAM);
		talonDrive.calibrateGyro();
		resetEncoders();
		
		//initialize master motors to use for motion profile 
		//A: master motors, as in when the back moves, the front will follow
		backLeft = talonDrive.getBackLeftDrive();
		backRight = talonDrive.getBackRightDrive(); 
		
		//initialize other motors
		//A: Initializes the 2 closed loop motors
		winchMotor = new Talon(4);
		conveyorMotor = new Talon(5);
		
		//initialize Joystick 
		//A: initializes the gaming pad and its buttons
		pad = new LogitechGamingPad(0);

		//initialize Camera Objects 
		//A: initializes the robot's camera and receives footage from the network at 10.40.79.11
		server = CameraServer.getInstance();
		visionCamera = new AxisCamera("visionCamera", new String[] { "10.40.79.11", "axis-camera.local" });
		usbCamera = new UsbCamera("usbCamera",0);
		
		
		//set Camera Values;
		//A: sets certain camera values
		usbCamera.setResolution(80, 60); //A: assuming these are X and Y dimensions
		usbCamera.setFPS(5); //A: 5 frames per second, obvious
		visionCamera.setResolution(480, 360); //A: assuming these are X and Y dimensions
		server.startAutomaticCapture(visionCamera); //A: starts the recording of the camera
		server.startAutomaticCapture(usbCamera);
		
		//initialize Ultrasonic Sensor
		//A: sonic sensor as in that weird sensor with voltage to inches conversions
		//sonicSensor = new LVMaxSonarEZUltrasonic(C.Port.SONIC_SENSOR_INPUT_PORT);

		//initialize Timer
		//A: initializes the timer from the wpilibj, in milliseconds i'm assuming
		timer = new Timer();

		//initialize Network Tables and Get Arrays from Contours Report
		//A: network tables that take X and Y values from the camera?
		table = NetworkTable.getTable("GRIP/myContoursReport");
		//centerY = table.getNumberArray("centerY", defaultValue);
		//centerX = table.getNumberArray("centerX", defaultValue);
		
		//initialize PDP
		//A: initializes PDP from wpilibj, probably does something important with the voltage
		pdp = new PowerDistributionPanel();
		pdp.clearStickyFaults(); //A: wut

		//set Joystick Toggles & Booleans
		//reverseDirectionToggle = false;
		conveyorToggle = false; //A: turns the buttons which toggles the conveyor off
		stop = false; //A: stop is false, which means go? not sure
		//reverseOrNah = false;
		conveyorOrNah = false; //A: turns the conveyor off
		upDPadToggle = false; //A: turns the up button of the dpad to a false state? not sure
		downDPadToggle = false; //A: turns the up button of the dpad to a false state? not sure
		//winchOrNah = false;
		//winchToggle = false;
		slowOrNah = false; //A: turns the slow mode of the conveyor off
		slowToggle = false; // turns the button which toggles the slow mode of the conveyor off
		
		//Autonomous Chooser
		chooser = new SendableChooser<String>(); //A: haven't seen how the chooser works in person, but assuming it creates an UI which allows autonomous selection
		chooser.addDefault("Straight Case",  case1Auto); //A: "Straight Case" is case1 in the code
		chooser.addObject("Left Case", case2Auto); //A: "Left Case" is case2 in the code
		chooser.addObject("Right Case", case3Auto); //A: "Right Case" is case3 in the code
		chooser.addObject("No Auto", "No Auto"); //A: "No Auto" does nothing
		SmartDashboard.putData("Auto choices", chooser); //A: provides a title for the smart dashboard?
		
		//initialize Preferences
		prefs = Preferences.getInstance();
		//A: sets default(?) PID values. Questions: f-gain, why is left P > than right P
		prefs.putDouble("Left F-Gain", 2.2); 
		prefs.putDouble("Right F-Gain", 2);
		prefs.putDouble("Left P-Value", 1.1);
		prefs.putDouble("Right P-Value", 1);
		prefs.putDouble("Left I-Value", 0.001);
		prefs.putDouble("Right I-Value", 0.001);
		prefs.putDouble("Left D-Value", 0);
		prefs.putDouble("Right D-Value", 0);
		prefs.putInt("Left I-Zone", 100); //encoder counts
		prefs.putInt("Right I-Zone", 100); //encoder counts
		prefs.putInt("Left Tolerable Error", 20); //encoder counts
		prefs.putInt("Right Tolerable Error", 20); //encoder counts
		
	}

	public void autonomousInit() {
		//A: autnomousInit: activates only once
		autoSelected = (String)chooser.getSelected();//A: allows selection of autonomous case
		timer.start(); //A: resets timer and encoder values
		resetEncoders();
		start = false;
		
		//A: resets and reenables drive motors
		backLeft.reset();
		backRight.reset();
		backLeft.enable();
		backRight.enable();
		
		//A: resets encoders
		resetEncoders();
		
		//backLeft.changeControlMode(TalonControlMode.Position);
		//backRight.changeControlMode(TalonControlMode.Position);
		
		//A: enables motion profiling for the back motors
		backLeft.changeControlMode(TalonControlMode.MotionProfile);
		backRight.changeControlMode(TalonControlMode.MotionProfile);
		
		//A: turns PID values off for motion profiling instead?
		backLeft.setF(prefs.getDouble("Left F-Gain", 0));
		backRight.setF(prefs.getDouble("Right F-Gain", 0));
		backLeft.setP(prefs.getDouble("Left P-Value", 0));
		backRight.setP(prefs.getDouble("Right P-Value", 0));
		backLeft.setI(prefs.getDouble("Left I-Value", 0));
		backRight.setI(prefs.getDouble("Right I-Value", 0));
		backLeft.setD(prefs.getDouble("Left D-Value", 0));
		backRight.setD(prefs.getDouble("Right D-Value", 0));
		backLeft.setIZone(prefs.getInt("Left I-Zone", 0));
		backRight.setIZone(prefs.getInt("Right I-Zone", 0));
		backLeft.setAllowableClosedLoopErr(prefs.getInt("Left Tolerable Error", 0));
		backRight.setAllowableClosedLoopErr(prefs.getInt("Right Tolerable Error", 0));
		backLeft.setVoltageRampRate(0);
		backRight.setVoltageRampRate(0);
		
		if (autoSelected.equals("No Auto"))
			//A: skips autonomous, straight to teleop
		{
			backLeft.changeControlMode(TalonControlMode.PercentVbus);
			backRight.changeControlMode(TalonControlMode.PercentVbus);
			
		}
		else {
			if (autoSelected.equals(case1Auto)){
				//A: plays Straight case (case1) and records X and Y coordinates for motion profiling
				leftProfile = new MotionProfileExample (backLeft, StraightCase1.Points);
				rightProfile = new MotionProfileExample (backRight, StraightCase1.getUpdatedPoints());
				}
			else if (autoSelected.equals(case2Auto)){
				//A: plays Left case (case2) and records X and Y coordinates for motion profiling
				leftProfile = new MotionProfileExample (backLeft, RightCase2.Points); 
				rightProfile = new MotionProfileExample (backRight, LeftCase2.getUpdatedPoints()); 
				}
			else if (autoSelected.equals(case3Auto)){
				//A: plays Right case (case3) and records X and Y coordinates for motion profiling
				leftProfile = new MotionProfileExample (backLeft, LeftCase2.Points);
				rightProfile = new MotionProfileExample (backRight, RightCase2.getUpdatedPoints());
				}
			//A: takes points from getUpdatedPoints, does something with it in motion profiling?
			rightProfile.startMotionProfile();
			leftProfile.startMotionProfile();
			//A: after done, resets
			rightProfile.reset();
			leftProfile.reset();
		}
		
		timer.start();
		
		//backLeft.set(30);
		//backRight.set(30);
	}

	public void autonomousPeriodic() {
		//A: autonomousPeriodic: loops itself while autonomous is active, only works if "No Auto" is not selected, AKA if any of the other 3 are selected
		if (!autoSelected.equals("No Auto"))
		{
			if (timer.get() > 0.2){ //A: 0.2 second (not millisecond) delay 
				rightProfile.startMotionProfile();
				leftProfile.startMotionProfile();
				start = true; 
			}
		
			if (start){ 
				rightProfile.control();
				leftProfile.control();
		
				CANTalon.SetValueMotionProfile setOutputRight = rightProfile.getSetValue(); //A: Guessing that right and left profiling straightens the robot if it goes off course?
				CANTalon.SetValueMotionProfile setOutputLeft = leftProfile.getSetValue();
		
				backRight.set(setOutputRight.value);
				backLeft.set(setOutputLeft.value);
			}
		}
		printEncoderValues(); //A: prints values to the UI, not sure where that is
	}
	
	
	public void teleopInit(){
		//A: initializes teleop mode, resets gyro and encoders
		talonDrive.resetGyro();
		resetEncoders();
		
		//A: sets to PercentVbus, but not sure what mode it was in before
		backLeft.changeControlMode(TalonControlMode.PercentVbus);
		backRight.changeControlMode(TalonControlMode.PercentVbus);
		
		backLeft.setVoltageRampRate(0); //A: something to do with voltage to 0
		backRight.setVoltageRampRate(0);
		//reverseOrNah = false; //A: the unused reverse conveyor function?
		slowOrNah = false; //A: turns slow mode of the conveyor off
	}

	public void teleopPeriodic() {
		//A: loops while teleop is active
		SmartDashboard.putNumber("Gyroscope value: ", talonDrive.getAngle()); //A: prints gyro values to the smart dashboard, in degrees/radians

		eStop1Pressed = pad.getBackButton(); //A: emergency stop button?
		//reverseDirectionPressed = pad.getAButton();
		conveyorPressed = pad.getYButton(); //A: conveyor button
		//winchPressed = pad.getXButton();
		slowPressed = pad.getBButton(); //A: slow conveyor button
		
		
		if (eStop1Pressed)
			stop = true; //A: probably stops everything
		/*
		//REVERSE TOGGLE
		if (reverseDirectionPressed && !reverseDirectionToggle)
		{
			reverseDirectionToggle = true;
			reverseOrNah = !reverseOrNah; 	
		}
		if (!reverseDirectionPressed)
			reverseDirectionToggle = false;
		*/
		
		//SLOW TOGGLE
		if (slowPressed && !slowToggle)
		{
			slowToggle = true;
			slowOrNah = !slowOrNah; //A: turns on slow mode
		}
		else if (!slowPressed)
					slowToggle = false; //A: turns on? 
		
		if ( !stop && /*reverseOrNah &&*/ !slowOrNah) //A: OOOOOHHH SLOW MODE MAKES THE ENTIRE DRIVING SLOWER, NOT JUST THE CONVEYOR
			talonDrive.tankDrive(-(0.5 * pad.getLeftAnalogY() * (1 + pad.getLeftTriggerValue())), (0.5 * pad.getRightAnalogY() * (1 + pad.getRightTriggerValue())) );
		//A: gets the values of the left and right analogs and drives according, pressing the triggers makes robot go faster?
		//else if (!stop && !reverseOrNah && !slowOrNah)
			//talonDrive.reverseTankDrive(0.5 * pad.getRightAnalogY() * (1 + pad.getRightTriggerValue()) , 0.5 * pad.getLeftAnalogY() * (1+ pad.getLeftTriggerValue()));
		
		else if (!stop && /*reverseOrNah &&*/ slowOrNah)
			talonDrive.tankDrive(-0.25 * pad.getLeftAnalogY() , 0.25 * pad.getRightAnalogY()); //A: slow mode... robot goes half as fast... (from factor of 0.5 to 0.25), triggers also disabled
		
		//else if (!stop && !reverseOrNah && slowOrNah)
		//talonDrive.reverseTankDrive(0.25 * pad.getRightAnalogY() , 0.25 * pad.getLeftAnalogY());
		
		
		//CONVEYOR TOGGLE
		if (conveyorPressed && !conveyorToggle)
		{
			//A: if conveyor button is pressed and conveyor off, turn it on
			conveyorToggle = true;
			conveyorOrNah = !conveyorOrNah; //A: turns continuous conveyor off
		}
		else if (!conveyorPressed)
			conveyorToggle = false; 
		//A: if conveyor button is not pressed, turn it off
		
		if (conveyorOrNah)
			//A: continuous conveyor
			conveyorMotor.set(-1);
		else if (!conveyorOrNah)
			//A: if false, continous conveyor off
			conveyorMotor.set(0);
		
		/*//WINCH TOGGLE
		 * A: Winch seems to be disabled, but probably used to work similarly to the conveyor
		if (winchPressed && !winchToggle)
		{
			winchToggle = true;
			winchOrNah = !winchOrNah;
		}
		else if (!winchPressed)
			winchToggle = false; 
		
		if (winchOrNah)
			winchMotor.set(-1);
		else if (!winchOrNah)
			winchMotor.set(0);
		*/
		
		//WINCH CONTINUOUS 
		if (pad.getRightBumper()) //A: right bumper makes winch go backwards
			winchMotor.set(-1);
		else if (pad.getLeftBumper()) //A: left bumper makes winch go forwards
			winchMotor.set(1);
		else 
			winchMotor.set(0); //A: if neither is being held, winch is off
		
		//TEST
		if (pad.checkDPad(0) && !upDPadToggle) 
			//A: checkDpad(0), guessing it's either the Up button or the state of no button being held. 
			//A: it seems that if the up button is pressed, the gyro resets. not sure what upDpadToggle does
		{
			upDPadToggle = true;
			talonDrive.resetGyro();
		}
		if (!pad.checkDPad(0)) //A: if up is not being pressed, upDPadToggle is false, still not sure what it does
			upDPadToggle = false;
		
		if (pad.checkDPad(0))
		{
			//A: if up is pressed and does something with the gyro??
			if (talonDrive.getAngle() > C.Speed.GYRO_ANGLE_LIMIT)
				talonDrive.tankDrive(C.Speed.GYRO_SLOWER_SPEED, C.Speed.STRAIGHT_DRIVE_SPEED);
			else if (talonDrive.getAngle() < C.Speed.GYRO_ANGLE_LIMIT)
				talonDrive.tankDrive(C.Speed.STRAIGHT_DRIVE_SPEED, C.Speed.GYRO_SLOWER_SPEED);
			else
				talonDrive.tankDrive(C.Speed.STRAIGHT_DRIVE_SPEED, C.Speed.STRAIGHT_DRIVE_SPEED);
		}
		
		if (pad.checkDPad(4) && !downDPadToggle)
			//A: position 4 = down. 
			//A: seems to do the exact same thing as checkDPad(0) AKA the up button being pressed
		{
			downDPadToggle = true;
			talonDrive.resetGyro();
		}
		if (!pad.checkDPad(4))
			downDPadToggle = false;
		
		if (pad.checkDPad(4))
		{
			if (talonDrive.getAngle() > C.Speed.GYRO_ANGLE_LIMIT)
				talonDrive.reverseTankDrive(C.Speed.GYRO_SLOWER_SPEED, C.Speed.STRAIGHT_DRIVE_SPEED);
			else if (talonDrive.getAngle() < C.Speed.GYRO_ANGLE_LIMIT)
				talonDrive.reverseTankDrive(C.Speed.STRAIGHT_DRIVE_SPEED, C.Speed.GYRO_SLOWER_SPEED);
			else
				talonDrive.reverseTankDrive(C.Speed.STRAIGHT_DRIVE_SPEED, C.Speed.STRAIGHT_DRIVE_SPEED);
		}
		
		
		printEncoderValues();
		
	}

	public void resetEncoders()
	//A: reseting encoders = setting all encoder counts to 0
	{
		talonDrive.getBackLeftDrive().setEncPosition(0);
		talonDrive.getFrontLeftDrive().setEncPosition(0);
		talonDrive.getFrontRightDrive().setEncPosition(0);
		talonDrive.getBackRightDrive().setEncPosition(0);
		
	} 
	//A: probably limits effectiveness of triggers if both are being pressed
	private double scaleTrigger(double trigger) {
		return Math.min(1.0, 1.0 - 0.9 * trigger);
	}
	//A: not sure what this does. Predicts distance for something, numbers seem arbitrary
	public double predictDistance(double pixels) {
		// y = -1.542693 + (2487.625 - -1.542693)/(1 + (x/1.294396)^0.9814597)
		double num = 2487.625 + 1.542693;
		double den = 1 + Math.pow((pixels / 1.294396), 0.9814597);
		return (num / den - 1.542693);
	}
	//A: function which prints all encoder values to the smartdashboard
	public void printEncoderValues()
	{
		double leftEnc = talonDrive.getBackLeftDrive().getEncPosition();
		double rightEnc = talonDrive.getBackRightDrive().getEncPosition();
		SmartDashboard.putNumber("Encoder Left Back: ", leftEnc);
		SmartDashboard.putNumber("Encoder Right Back: ", rightEnc);
		SmartDashboard.putNumber("Encoder Left Front: ", talonDrive.getFrontLeftDrive().getEncPosition());
		SmartDashboard.putNumber("Encoder Right Front: ", talonDrive.getFrontRightDrive().getEncPosition());
		//SmartDashboard.putNumber("Distance: ", sonicSensor.getDistance());
		SmartDashboard.putNumber("Left Encoder Distance: ", leftEnc/80/10.71*6*Math.PI); //A:Distance measured using encoder counts, gear ratio, and wheel circumference
		SmartDashboard.putNumber("Right Encoder Distance: ", rightEnc/80/10.71*6*Math.PI);
		SmartDashboard.putNumber("Right Error: ", backRight.getClosedLoopError()); //encoder counts
		SmartDashboard.putNumber("Left Error: ", backLeft.getClosedLoopError()); //encoder counts
		SmartDashboard.putNumber("Gyroscope Value ",talonDrive.getAngle()); //A: gets the angle from the gyroscope
	}
	//A: unused test periodic state
	public void testPeriodic() {
	}
}

