package frc.team3482.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3482.RobotMap;

public class beltyBois extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static double beltSpeed = .4;

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void forward()
    {
        RobotMap.beltLeft.set(beltSpeed);
        RobotMap.beltRight.set(beltSpeed);
    }

    public void backwards()
    {
        RobotMap.beltLeft.set(-beltSpeed);
        RobotMap.beltRight.set(-beltSpeed);
    }

    public void stop()
    {
        RobotMap.beltRight.set(0);
        RobotMap.beltLeft.set(0);
    }

}

