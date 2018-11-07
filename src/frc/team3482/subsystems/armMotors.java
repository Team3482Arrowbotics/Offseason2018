package frc.team3482.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3482.RobotMap;

public class armMotors extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public double intakeSpeed = .3;

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void inward()
    {
        RobotMap.intakeSpinnyLeft.set(intakeSpeed);
        RobotMap.intakeSpinnyRight.set(-intakeSpeed);
    }

    public void outward()
    {
        RobotMap.intakeSpinnyLeft.set(-intakeSpeed);
        RobotMap.intakeSpinnyRight.set(intakeSpeed);
    }

    public void stop()
    {
        RobotMap.intakeSpinnyLeft.set(0);
        RobotMap.intakeSpinnyRight.set(0);
    }


}

