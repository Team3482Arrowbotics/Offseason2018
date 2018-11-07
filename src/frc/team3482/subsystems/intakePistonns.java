package frc.team3482.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3482.RobotMap;

public class intakePistonns extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void open()
    {
        RobotMap.intakeLeft.set(DoubleSolenoid.Value.kReverse);
        RobotMap.intakeRight.set(DoubleSolenoid.Value.kReverse);
    }

    public void close()
    {
        RobotMap.intakeLeft.set(DoubleSolenoid.Value.kForward);
        RobotMap.intakeRight.set(DoubleSolenoid.Value.kForward);
    }


}

