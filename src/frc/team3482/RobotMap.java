/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3482;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{

    public static WPI_TalonSRX backLeft;
    public static WPI_TalonSRX backRight;
    public static WPI_TalonSRX frontLeft;
    public static WPI_TalonSRX frontRight;
    public static WPI_TalonSRX beltLeftOne;
    public static WPI_TalonSRX beltLeftTwo;
    public static WPI_TalonSRX beltRightOne;
    public static WPI_TalonSRX beltRightTwo;
    public static WPI_TalonSRX intakeSpinnyLeft;
    public static WPI_TalonSRX intakeSpinnyRight;

    public static DoubleSolenoid intakeLeft;
    public static DoubleSolenoid intakeRight;

    public static SpeedControllerGroup left;
    public static SpeedControllerGroup right;
    public static SpeedControllerGroup beltLeft;
    public static SpeedControllerGroup beltRight;

    public static DifferentialDrive drive;

    public static AHRS gyro;

    public static void init(){
        //drive
        backLeft = new WPI_TalonSRX(8);
        backRight = new WPI_TalonSRX(4);
        frontLeft = new WPI_TalonSRX(1);
        frontRight = new WPI_TalonSRX(0);

        left = new SpeedControllerGroup(backLeft,frontLeft);
        right = new SpeedControllerGroup(backRight, frontRight);

        drive = new DifferentialDrive(left, right);

        gyro = new AHRS(SerialPort.Port.kMXP);

        //ramp motors, change talon numbers
        beltLeftOne = new WPI_TalonSRX(2);
        beltLeftTwo = new WPI_TalonSRX(3);
        beltRightOne = new WPI_TalonSRX(5);
        beltRightTwo = new WPI_TalonSRX(6);

        beltLeft = new SpeedControllerGroup(beltLeftOne, beltLeftTwo);
        beltRight = new SpeedControllerGroup(beltRightOne, beltRightTwo);

        //intake pistons
        intakeLeft = new DoubleSolenoid(0,1);
        intakeRight = new DoubleSolenoid(2,3);

        //intake motors
        intakeSpinnyLeft = new WPI_TalonSRX(7);
        intakeSpinnyRight = new WPI_TalonSRX(9);


    }
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
