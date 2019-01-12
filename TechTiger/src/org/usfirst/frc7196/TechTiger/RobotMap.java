// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7196.TechTiger;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController cubeIntakeLeftMotor;
    public static SpeedController cubeIntakeRightMotor;
    public static SpeedControllerGroup cubeIntakeCubeIntakeMotors;
    public static DigitalInput elevatorLimitSwitchElevatorHigh;
    public static SpeedController elevatorElevatorMotorTalon;
    public static DigitalInput elevatorLimitSwicthElevatorMiddle;
    public static SpeedController driveTrainNorthwestMotor;
    public static SpeedController driveTrainSouthwestMotor;
    public static SpeedController driveTrainNortheastMotor;
    public static SpeedController driveTrainSoutheastMotor;
    public static RobotDrive driveTrainRobotDrive4;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        cubeIntakeLeftMotor = new Spark(4);
        LiveWindow.addActuator("CubeIntake", "Left Motor", (Spark) cubeIntakeLeftMotor);
        cubeIntakeLeftMotor.setInverted(false);
        cubeIntakeRightMotor = new Spark(5);
        LiveWindow.addActuator("CubeIntake", "Right Motor", (Spark) cubeIntakeRightMotor);
        cubeIntakeRightMotor.setInverted(false);
        cubeIntakeCubeIntakeMotors = new SpeedControllerGroup(cubeIntakeLeftMotor, cubeIntakeRightMotor  );
        LiveWindow.addActuator("CubeIntake", "Cube Intake Motors", cubeIntakeCubeIntakeMotors);
        
        elevatorLimitSwitchElevatorHigh = new DigitalInput(0);
        LiveWindow.addSensor("Elevator", "Limit SwitchElevatorHigh", elevatorLimitSwitchElevatorHigh);
        
        elevatorElevatorMotorTalon = new Spark(6);
        LiveWindow.addActuator("Elevator", "ElevatorMotorTalon", (Spark) elevatorElevatorMotorTalon);
        elevatorElevatorMotorTalon.setInverted(true);
        elevatorLimitSwicthElevatorMiddle = new DigitalInput(1);
        LiveWindow.addSensor("Elevator", "Limit Swicth Elevator Middle", elevatorLimitSwicthElevatorMiddle);
        
        driveTrainNorthwestMotor = new Spark(0);
        LiveWindow.addActuator("DriveTrain", "Northwest Motor", (Spark) driveTrainNorthwestMotor);
        driveTrainNorthwestMotor.setInverted(false);
        driveTrainSouthwestMotor = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "Southwest Motor", (Spark) driveTrainSouthwestMotor);
        driveTrainSouthwestMotor.setInverted(false);
        driveTrainNortheastMotor = new Spark(2);
        LiveWindow.addActuator("DriveTrain", "Northeast Motor", (Spark) driveTrainNortheastMotor);
        driveTrainNortheastMotor.setInverted(false);
        driveTrainSoutheastMotor = new Spark(3);
        LiveWindow.addActuator("DriveTrain", "Southeast Motor", (Spark) driveTrainSoutheastMotor);
        driveTrainSoutheastMotor.setInverted(false);
        driveTrainRobotDrive4 = new RobotDrive(driveTrainNorthwestMotor, driveTrainSouthwestMotor,
              driveTrainNortheastMotor, driveTrainSoutheastMotor);
        
        driveTrainRobotDrive4.setSafetyEnabled(true);
        driveTrainRobotDrive4.setExpiration(0.1);
        driveTrainRobotDrive4.setSensitivity(0.8);
        driveTrainRobotDrive4.setMaxOutput(1.0);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive4.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
