// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4311;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController robotDriveRightFront;
    public static SpeedController robotDriveLeftFront;
    public static SpeedController robotDriveRightRear;
    public static SpeedController robotDriveLeftRear;
    public static RobotDrive robotDriveDrive;
    public static SpeedController armRight;
    public static SpeedController armLeft;
    public static Relay actuator;
    public static Relay armWheelRight;
    public static Relay armWheelLeft;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        robotDriveRightFront = new Talon(8);
        LiveWindow.addActuator("RobotDrive", "RightFront", (Talon) robotDriveRightFront);
        
        robotDriveLeftFront = new Talon(1);
        LiveWindow.addActuator("RobotDrive", "LeftFront", (Talon) robotDriveLeftFront);
        
        robotDriveRightRear = new Talon(7);
        LiveWindow.addActuator("RobotDrive", "RightRear", (Talon) robotDriveRightRear);
        
        robotDriveLeftRear = new Talon(2);
        LiveWindow.addActuator("RobotDrive", "LeftRear", (Talon) robotDriveLeftRear);
        
        robotDriveDrive = new RobotDrive(robotDriveLeftRear, robotDriveLeftFront,
              robotDriveRightRear, robotDriveRightFront);
        
        robotDriveDrive.setSafetyEnabled(true);
        robotDriveDrive.setExpiration(0.1);
        robotDriveDrive.setSensitivity(0.5);
        robotDriveDrive.setMaxOutput(1.0);

        armRight = new Victor (9);
        LiveWindow.addActuator("Arm", "Height", (Victor) armRight);
        
        armLeft = new Victor(0);
        LiveWindow.addActuator("Arm", "Extend", (Victor) armLeft);
        
        armWheelRight = new Relay(2);
        LiveWindow.addActuator("ArmWheels", "Left", armWheelRight);
        
        armWheelLeft = new Relay(1);
        LiveWindow.addActuator("ArmWheels", "Right", armWheelLeft);
        
        actuator = new Relay(3);
        LiveWindow.addActuator("BallActuator","Actuator", actuator);
        
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
