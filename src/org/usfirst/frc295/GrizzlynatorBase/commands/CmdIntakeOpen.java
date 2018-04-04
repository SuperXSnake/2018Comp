package org.usfirst.frc295.GrizzlynatorBase.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc295.GrizzlynatorBase.Robot;
	public class CmdIntakeOpen extends Command //9 + 10
	{
		
		public CmdIntakeOpen()
		{
		
		}

		// Called just before this Command runs the first time
		@Override
		protected void initialize()
		{
//			Robot.sysDriveTrain.reset();
		}


		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute()
		{
				Robot.sysIntake.OpenIntake();
			
		}


		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished()
		{
			return true;
		}


		// Called once after isFinished returns true
		@Override
		protected void end()
		{
		
		}


		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted()
		{
		}
}