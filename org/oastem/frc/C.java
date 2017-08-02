package org.oastem.frc;

public class C {
	//A: seems to list the steps in which the robot will follow during autonomous
	public class Auto{
		public static final int DRIVE_STRAIGHT = 1;
		public static final int MOMENTUM_STOP= 2;
		public static final int TURN = 3; 
		public static final int STOP_WHEN_CENTERED = 4; 
		public static final int SELF_CORRECT_DRIVE = 5; 
		public static final int STOP_WHEN_CLOSE_ENOUGH = 6; 
	}
	//A: seems to list the 4 drive motors from 0 to 3
	public class Port{
		public static final int FRONT_LEFT_CAN_DRIVE = 3;
		public static final int FRONT_RIGHT_CAN_DRIVE = 2;
		public static final int BACK_LEFT_CAN_DRIVE = 0;
		public static final int BACK_RIGHT_CAN_DRIVE = 1;
		public static final int SONIC_SENSOR_INPUT_PORT = 0;
	}
	//A: lists important converstion factors involving the wheels and motors
	public class Drive{
		public static final int DRIVE_ENC_PULSE_PER_REV = 20; 
		public static final int DRIVE_WHEEL_DIAM = 6; 
	}
	//A: lists the dimensions of the camera along with its half-measuremeants
	public class Cam{
		public static final int CAMERA_RESOLUTION_WIDTH = 480;
		public static final int CAMERA_RESOLUTION_HEIGHT = 360; 
		public static final int HALF_RES_LEFT = CAMERA_RESOLUTION_WIDTH/2 - 20;
		public static final int HALF_RES_RIGHT = CAMERA_RESOLUTION_WIDTH/2 + 20;
	}
	//A: Lists some recommended speed values for the motors, presumably to incorporate into PID
	//A: Also lists the turn speed and rotation limit of the Gyroscope
	public class Speed{
		public static final double SWERVE_DRIVE_SPEED = 0.3;
		public static final double STRAIGHT_DRIVE_SPEED = 0.3;
		public static final double SLOWER_DRIVE_SPEED = 0.2;
		public static final double GYRO_SLOWER_SPEED = 0.26;
		public static final double TURN_SPEED = 0.8;
		public static final double STOP_SPEED = 0;
		public static final double GYRO_ANGLE_LIMIT = 1;
	}
	//A: list a min and max distance for something, don't know what. maybe autonomous?
	public class Dist{
		public static final int MIN_DISTANCE = 14;
		public static final int MAX_DISTANCE = 16; 
	}
}
