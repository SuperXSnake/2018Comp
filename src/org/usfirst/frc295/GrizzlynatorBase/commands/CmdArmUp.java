package org.usfirst.frc295.GrizzlynatorBase.commands;

import org.usfirst.frc295.GrizzlynatorBase.Robot;
import org.usfirst.frc295.GrizzlynatorBase.subsystems.SysElevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

//Command is empty for now. Needs to be completed.

public class CmdArmUp extends Command {

    public CmdArmUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    protected void execute() {
    	Robot.sysIntake.armthingup();
    }

    protected boolean isFinished() {
        return !Robot.sysIntake.isTopthingset();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.sysIntake.armthingnothing();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.sysIntake.armthingnothing();
    }
}
