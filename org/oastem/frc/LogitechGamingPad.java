package org.oastem.frc;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;

/**
 * @author OA STEM
 * @author mduong15
 * @version Beta 1.0
 *
 * Handle input from Logitech Gaming Pad devices connected to the Driver Station.
 * This class handles standard input that comes from the Driver Station. Each time
 * a value is requested, the most recent value is returned. There is a single class
 * instance for each Logitech Gaming Pad and the mapping of ports to hardware
 * buttons is already configured in the class by using the correct "get-" methods.
 * 
 * The Logitech Gaming Pad must be set to XInput (the back of the controller
 * should be switched to the 'X'/left side). DirectInput (or the right side)
 * requires additional software that is unnecessary.
 */

public class LogitechGamingPad extends GenericHID{
	
	/**
	 * The Joystick class is utilized for simplicity.
	 */
	private Joystick gamepad;
	
	
	/**
	 * Construct an instance of a Logitch Gaming Pad. The Logitech Gaming Pad index
	 * is the usb port on the driver station.
	 *
	 * @param port The port on the driver station that the gamepad is plugged
	 *        into.
	 */
	//A: Dont understand super
	public LogitechGamingPad(int port)
	{
		super(0);
		gamepad = new Joystick(port);
	}
	
	
	// The following methods are get methods specific to the Logitech Gaming Pad.
	// Use these methods to get button values.
	
	/**
	 * Get the X value of the left analog.
	 * 
	 * @return The left X value.
	 */
	public double getLeftAnalogX()
	{
		return getX(Hand.kLeft); //A: uses the "getX" function on the left analog, and returns an X value
	}
	
	/**
	 * Get the Y value of the left analog.
	 * 
	 * @return The left Y value.
	 */
	public double getLeftAnalogY()
	{
		return getY(Hand.kLeft); //A: uses the "getY" function on the left analog, and returns an Y value
	}
	
	/**
	 * Read the state of the left analog button.
	 * This is the button part of the analog.
	 * 
	 * @return The state of the button.
	 */
	public boolean getLeftAnalogButton()
	{
		return gamepad.getRawButton(9); //A: Checks whether the left analog is being pressed down (true) or not (false). This is the "9th" button
	}
	
	/**
	 * Read the state of the left bumper.
	 * The bumpers are the two upper buttons of the four on the
	 * top of the gamepad. They are either pressed or released.
	 * 
	 * @return The state of the bumper.
	 */
	public boolean getLeftBumper()
	{
		return getBumper(Hand.kLeft); //A: Checks whether the left bumper (AKA upper shoulder button)  is being pressed down (true) or not (false)
	}
	
	/**
	 * Read the state of the left trigger.
	 * The triggers are the two lower buttons of the four on
	 * the top of the gamepad. How much they are pressed can vary.
	 * 
	 * @return The state of the trigger.
	 */
	public boolean getLeftTrigger()
	{
		return getTrigger(Hand.kLeft); //A: Checks whether the left trigger (AKA lower shoulder button)  is being pressed down (true) or not (false)
	}
	
	/**
	 * Get the value of the left trigger. The trigger returns a double [0, 1]
	 * depending on how much the trigger is pressed. 0 is nothing pressed
	 * and 1 is the trigger pressed all the way. 
	 * 
	 * This method can be used if something wants to be varied depending on
	 * how much the trigger is pressed.
	 * 
	 * @return The value of the left trigger.
	 */
	public double getLeftTriggerValue()
	{
		return gamepad.getRawAxis(2); //A: Returns the depth in which the left trigger is being pressed with a value between 0 and 1. This is the "2nd" button
	}
	
	/**
	 * Get the X value of the right analog.
	 * 
	 * @return The right X value.
	 */
	public double getRightAnalogX()
	{
		return getX(Hand.kRight); //A: uses the "getX" function on the right analog, returning an X value
	}
	
	/**
	 * Get the Y value of the right analog.
	 * 
	 * @return The right Y value.
	 */
	public double getRightAnalogY()
	{
		return getY(Hand.kRight); //A: uses the "getY" function on the right analog, returnin a Y value
	}
	
	/**
	 * Read the state of the right analog button.
	 * This is the button part of the analog.
	 * 
	 * @return The state of the button.
	 */
	public boolean getRightAnalogButton()
	{
		return gamepad.getRawButton(10); //A: Checks whether the left analog is being pressed down (true) or not (false). This is the "10th" button
	}
	
	/**
	 * Read the state of the right bumper.
	 * The bumpers are the two upper buttons of the four on the
	 * top of the gamepad. They are either pressed or released.
	 * 
	 * @return The state of the bumper.
	 */
	public boolean getRightBumper()
	{
		return getBumper(Hand.kRight); //A: Checks whether the right bumper (AKA upper shoulder button)  is being pressed down (true) or not (false)
	}
	
	/**
	 * Read the state of the right trigger.
	 * The triggers are the two lower buttons of the four on
	 * the top of the gamepad. How much they are pressed can vary.
	 * 
	 * @return The state of the trigger.
	 */
	public boolean getRightTrigger()
	{
		return getTrigger(Hand.kRight); //A: Checks whether the right trigger (AKA lower shoulder button)  is being pressed down (true) or not (false)
	}
	
	/**
	 * Get the value of the right trigger. The trigger returns a double [0, 1]
	 * depending on how much the trigger is pressed. 0 is nothing pressed
	 * and 1 is the trigger pressed all the way. 
	 * 
	 * This method can be used if something wants to be varied depending on
	 * how much the trigger is pressed.
	 * 
	 * @return The value of the right trigger.
	 */
	public double getRightTriggerValue()
	{
		return gamepad.getRawAxis(3); //A: Returns the depth in which the right trigger is being pressed with a value between 0 and 1. This is the "3rd" button
	}
	
	/**
	 * Read the state of the 'A' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getAButton()
	{
		return gamepad.getRawButton(1); //A: Returns the state of the A button (T/F). This is the "1st" button
	}
	
	/**
	 * Read the state of the 'B' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getBButton()
	{
		return gamepad.getRawButton(2); //A: Returns the state of the B button (T/F). This is the "2nd" button
	}
	
	/**
	 * Read the state of the 'X' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getXButton()
	{
		return gamepad.getRawButton(3); //A: Returns the state of the X button (T/F). This is the "3rd" button
	}
	
	/**
	 * Read the state of the 'Y' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getYButton()
	{
		return gamepad.getRawButton(4); //A: Returns the state of the Y button (T/F). This is the "4th" button
	}
	
	/**
	 * Read the state of the 'BACK' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getBackButton()
	{
		return gamepad.getRawButton(7); //A: Returns the state of the Back button (T/F). This is the "7th" button
	}
	
	/**
	 * Read the state of the 'START' button.
	 * 
	 * @return The state of the button.
	 */
	public boolean getStartButton()
	{
		return gamepad.getRawButton(8); //A: Returns the state of the Start button (T/F). This is the "8th" button
	}
	
	
	/**
	 * Check the state of the D-pad. The {@code index} is a value [0, 7] that corresponds
	 * to the combinations on the D-pad. 0 represents just 'UP' being pressed,
	 * 1 is 'UP-RIGHT', 2 is just 'RIGHT', 3 is 'RIGHT-DOWN', and so on.
	 * 
	 * This method can be used to see if a specific button on the D-pad is pressed.
	 * 
	 * @param index The value to correspond to a D-pad combination.
	 * @return If the specified combination is pressed.
	 */
	
	//A: Checks if the index matches the position being pressed in the Dpad. 
	public boolean checkDPad(int index)
	{
		if (0 <= index && index <= 7)
			return (index * 45) == gamepad.getPOV();
		else
			return false;
	}
	
	/**
	 * Check the state of the D-pad. The method compares the angle measurement
	 * and returns if the angle returned by the D-pad is equivalent. The angle
	 * can be in either degrees or radians depending on {@code inDegrees}.
	 * 
	 * Note: The D-pad can only return measurements in increments of 45 starting
	 * at 0, and -1 if it is not pressed. 0 is just the 'UP' button pressed, 45
	 * is 'UP-RIGHT', 90 is just 'RIGHT', 135 is 'RIGHT-DOWN', and so on until 315.
	 * 
	 * This method can be used to see if an angle measurement of a component is at
	 * the one specified by the D-pad.
	 * 
	 * @param angle The angle to compare to the D-pad's angle.
	 * @param inDegrees If the angle is in degrees or radians.
	 * @return If the angle is the same as the D-pad.
	 */
	 //A: If "inDegrees" is false, find the angle in degrees
	public boolean checkDPad(double angle, boolean inDegrees)
	{
		if (!inDegrees)
			angle = Math.toDegrees(angle);
		return (int)angle == gamepad.getPOV(); 
	}
	
	/**
	 * Get the state of the D-pad. The method will return an index that is a value
	 * [-1, 7] and corresponds to the combinations on the D-pad. 0 represents just
	 * 'UP' being pressed, 1 is 'UP-RIGHT', 2 is just 'RIGHT', 3 is 'RIGHT-DOWN',
	 * and so on. -1 means the D-pad is not pressed.
	 * 
	 * This method can be used in something like a switch statement to have different
	 * actions depending on which button(s) is(are) pressed.
	 * 
	 * @return An indexed representation of the D-pad combination. 
	 */
	//A: Get position of the Dpad from 1-7. getPOV gets degrees from 0-315, but can be simplified into 7 positions due the 45 degree intervals.
	public int getDPad()
	{
		int pov = gamepad.getPOV();
		if (pov == -1)
			return pov;
		else
			return pov/45;
	}
	
	/**
	 * Get the state of the D-pad. The value is returned in degrees or radians
	 * depending on {@code inDegrees}.
	 * 
	 * Note: The D-pad can only return measurements in increments of 45 starting
	 * at 0, and -1 if it is not pressed. 0 is just the 'UP' button pressed, 45
	 * is 'UP-RIGHT', 90 is just 'RIGHT', 135 is 'RIGHT-DOWN', and so on until 315.
	 * 
	 * @param inDegrees If the returned angle should be in degrees or radians.
	 * @return The D-pad's angle in either degrees or radians.
	 */
	//A: if measuring in degrees, get the degrees of gamepad. If not, get position in radians
	public double getDPad(boolean inDegrees)
	{
		if (inDegrees)
			return gamepad.getPOV();
		else
			return Math.toRadians(gamepad.getPOV());
	}
	
	/**
	 * Get if any of the buttons on the D-pad is pressed. Any combination of
	 * buttons on the D-pad being pressed will result in the method returning
	 * true.
	 * 
	 * @return The state of the D-pad.
	 */
	 //A: checks if any button on Dpad is pressed
	public boolean dPadIsPressed()
	{
		return gamepad.getPOV() != -1;
	}
	
	/**
	 * Sets the rumble output for the Logitech Gaming Pad. The method will
	 * set the same rumble value to both sides.
	 * 
	 * THIS IS NOT TESTED AS OF 1/30/2016.
	 * 
	 * @param amount The normalized value (0 to 1) to set the rumble to.
	 */
	 //A: sets the amount of rumble distributed on the Dpad (from 0 to 1) 
	public void setRumble(float amount)
	{
		gamepad.setRumble(RumbleType.kLeftRumble, amount);
		gamepad.setRumble(RumbleType.kRightRumble, amount);
	}
	
	
	
	
	// The following methods are generic methods required by the abstract class.
	// The above methods should be used to get the gamepad inputs. 
	/**
	 * Get the value of the x-axis of a specific analog.
	 * 
	 * @param hand The left or right analog.
	 * @return The value of the axis.
	 */
	//A: gets X from either hand
	public double getX(Hand hand) {
		if (hand == Hand.kLeft)
			return gamepad.getRawAxis(0);
		else
			return gamepad.getRawAxis(4);
	}

	/**
	 * Get the value of the y-axis of a specific analog.
	 * 
	 * @param hand The left or right analog.
	 * @return The value of the axis.
	 */
	//A: gets Y from either hand
	public double getY(Hand hand) {
		if (hand == Hand.kLeft)
			return gamepad.getRawAxis(1);
		else
			return gamepad.getRawAxis(5);
	}

	/**
	 * Get the value of the axis.
	 *
	 * @param axis The axis to read, starting at 0.
	 * @return The value of the axis.
	 */
	//A: Fail to understand
	public double getRawAxis(int which) {
		return gamepad.getRawAxis(which);
	}

	
	/**
	 * Read the state of the trigger of a specific side.
	 * 
	 * Because the trigger is read as an axis and returns a value
	 * [0, 1] instead of [-1, 1], this method will return true
	 * even if the trigger is only slightly pressed.
	 * 
	 * @param hand The left or right trigger(side).
	 * @return The state of the trigger.
	 */
	//A: returns the depth of the trigger if a trigger is being pressed
	public boolean getTrigger(Hand hand) {
		if (hand == Hand.kLeft)
			return gamepad.getRawAxis(2) > 0;
		else
			return gamepad.getRawAxis(3) > 0;
	}

	/**
	 * Read the state of the bumper of a specific side.
	 * 
	 * @param hand The left or right bumper(side).
	 * @return The state of the bumper.
	 */
	//A: gets the state of the bumper
	public boolean getBumper(Hand hand) {
		if (hand == Hand.kLeft)
			return gamepad.getRawButton(5);
		else
			return gamepad.getRawButton(6);
	}

	/**
	 * Get the button value (starting at button 1).
	 *
	 * The appropriate button is returned as a boolean value.
	 *
	 * @param button The button number to be read (starting at 1).
	 * @return The state of the button.
	 */
	//A: checks the state of any button
	public boolean getRawButton(int button) {
		return gamepad.getRawButton(button);
	}

	/**
	 * Get the state of a POV on the gamepad.
	 *
	 * @param pov The index of the POV to read (starting at 0).
	 * @return the angle of the POV in degrees, or -1 if the POV is not pressed.
	 */
	//A: gets the angle of the Dpad?
	public int getPOV(int pov) {
		return gamepad.getPOV(pov);
	}
	
	/**
	 * This is not supported for the Logitech Gaming Pad. This method is only here to
	 * complete the GenericHID interface.
	 *
	 * @param hand This parameter is ignored and is only
	 *        here to complete the GenericHID interface.
	 * @return The value of the axis (always 0).   
	 */
	//A: not important
	public double getZ(Hand hand) {
		return 0;
	}
	
	/**
	 * This is not supported for the Logitech Gaming Pad. This method is only here to
	 * complete the GenericHID interface.
	 * 
	 * @return The twist value of the gamepad (always 0).
	 */
	//A: not important
	public double getTwist() {
		return 0;
	}
	
	/**
	 * This is not supported for the Logitech Gaming Pad. This method is only here to
	 * complete the GenericHID interface.
	 * 
	 * @return The throttle value of the gamepad (always 0).
	 */
	//A: not important
	public double getThrottle() {
		return 0;
	}
	
	/**
	 * This is not supported for the Logitech Gaming Pad. This method is only here to
	 * complete the GenericHID interface.
	 *
	 * @param hand This parameter is ignored and is only
	 *        here to complete the GenericHID interface.
	 * @return The state of the top (always false).
	 */
	//A: not important
	public boolean getTop(Hand hand) {
		return false;
	}

    //A: overrides... assuming this generally gets everything to stop by resetting everything to 0/null
	@Override
	public int getPOVCount() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public HIDType getType() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setOutput(int outputNumber, boolean value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setOutputs(int value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setRumble(RumbleType type, double value) {
		// TODO Auto-generated method stub
		
	}
}
