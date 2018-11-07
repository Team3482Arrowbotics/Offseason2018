/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3482;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team3482.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{

    public static Joystick controller;
    public static JoystickButton beltsIn;
    public static JoystickButton beltsOut;
    public static JoystickButton intakePistonIn;
    public static JoystickButton intakePistonOut;
    public static JoystickButton intakeSpinny;
    public static JoystickButton outtakeSpinny;

    public OI(){
        controller = new Joystick(0);
        beltsIn = new JoystickButton(controller,1); //A button
        beltsOut = new JoystickButton(controller, 4); //Y Button
        intakePistonIn = new JoystickButton(controller,5); //LB
        intakePistonOut = new JoystickButton(controller, 6); //RB
        intakeSpinny = new JoystickButton(controller,3); //X Button
        outtakeSpinny = new JoystickButton(controller, 2);  //B Button


        beltsIn.whenPressed(new beltsRunner());
        beltsOut.whenPressed(new beltsRunnerBackwards());
        intakePistonIn.whenPressed(new armsClose());
        intakePistonOut.whenPressed(new armsOpen());
        intakeSpinny.whenPressed(new armsSpinIntake());
        outtakeSpinny.whenPressed(new armsSpinOuttake());
    }

    // CREATING BUTTONS
    // One type of button is a joystick button which is any button on a
    // joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
