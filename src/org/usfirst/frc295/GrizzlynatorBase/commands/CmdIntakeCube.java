package org.usfirst.frc295.GrizzlynatorBase.commands;

import org.usfirst.frc295.GrizzlynatorBase.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CmdIntakeCube extends Command {

	boolean cubeIn;
	boolean firstRun;
	
    public CmdIntakeCube() {
    	firstRun = true;
    	cubeIn = Robot.sysIntake.hasCube();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.sysIntake.MotorSpeedReset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {    
    	
    	if(firstRun == true)
    	{
    		cubeIn = Robot.sysIntake.hasCube();
    		firstRun = false;
    	}
    	
    	Robot.sysIntake.AutoIntake();   	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return cubeIn != Robot.sysIntake.hasCube();
    }

    // Called once after isFinished returns true
    protected void end() {
    	firstRun = true;
    	Robot.sysIntake.MotorSpeedReset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}