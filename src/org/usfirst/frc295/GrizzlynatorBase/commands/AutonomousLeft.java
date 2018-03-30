// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc295.GrizzlynatorBase.commands;
import org.usfirst.frc295.GrizzlynatorBase.Robot;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.networktables.*;
/**
 *
 */
public class AutonomousLeft extends CommandGroup //9 + 10
{
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
//   BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutonomousLeft()
    {
//      addSequential(new Waypoint(Math.PI*5,0,.7,false));
//      addSequential(new Waypoint(30,0,.7,false));
//      addSequential(new Wait());
//      addSequential(new Waypoint(0,90,.7,false));
//      addSequential(new CmdElevatorSwitch());
//      addSequential(new CmdAutoDetake());
//      addSequential(new CmdElevatorBottom());
//      addSequential(new CmdIntakeCube());
//      addSequential(new Waypoint(0,45,.5,false));
//      addSequential(new Wait());
//      addSequential(new Waypoint(0,45,-.5,false));
//      addSequential(new Wait());                        o999k
//      addSequential(new Waypoint(0,22,.5,false));
//      addSequential(new Wait());
//      addSequential(new Waypoint(0,90,.5,false));
    	 addSequential(new CmdDriveTrainShiftLowGear());
         System.out.println("1");
         addSequential(new CmdDropIntake());
         System.out.println("2");
         addSequential(new Waypoint(50,0,.7,false));
         System.out.println("3");
         addSequential(new CmdElevatorSwitch());
         System.out.println("4");
         addSequential(new Wait());
         System.out.println("5");
         addSequential(new Waypoint(30,0,.6,false));
         System.out.println("6");
         addSequential(new Wait());
         System.out.println("7");
         
    	
        if(Robot.gameData.charAt(0) == 'R')
        {
//        addSequential(new CmdDriveTrainShiftLowGear());
//        System.out.println("1");
//        addSequential(new CmdDropIntake());
//        System.out.println("2");
//        addSequential(new Waypoint(50,0,.7,false));
//        System.out.println("3");
//        addSequential(new CmdElevatorSwitch());
//        System.out.println("4");
//        addSequential(new Wait());
//        System.out.println("5");
//        addSequential(new Waypoint(30,0,.6,false));
//        System.out.println("6");
//        addSequential(new Wait());
//        System.out.println("7");
        addSequential(new AutonomousDropCube());
        System.out.println("8");
//            addSequential(new Waypoint(168,0,.8,false));
//            addSequential(new Wait());
//            addSequential(new Waypoint(0,90,.5,false));//turn left
//            addSequential(new Wait());
//            addSequential(new CmdElevatorSwitch());
//            addSequential(new Waypoint(12,0,.8,false));
//            addSequential(new Wait());
//            addSequential(new AutonomousDropCube());
//            addSequential(new Wait());
//            addSequential(new Waypoint(24,0,-.8,false));
//            addSequential(new Wait());
//            addSequential(new Waypoint(0,-90,.5,false));
//            addSequential(new Wait());
//            addSequential(new Waypoint(18,0,.8,false));
//            addSequential(new Wait());
//            addSequential(new Waypoint(0,90,.5,false));
//            addSequential(new Wait());
//        	addSequential(new CmdDropIntake());
//            addSequential(new Waypoint_Time(1.66,0,.8,false));
            
        }
//        else if(Robot.gameData.charAt(1) == 'R')
//        {
////          addSequential(new Waypoint(324,0,.9,false));
////          addSequential(new Wait());
////          addSequential(new Waypoint(0,90,.5,false));
////          addSequential(new Wait());
////          addSequential(new CmdElevatorScale());
////          addSequential(new CmdAutoDetake());
////          addSequential(new Wait());
////          addSequential(new CmdElevatorBottom());
////          addSequential(new Wait());
////          addSequential(new Waypoint(0,-90,.5,false));
////        	addSequential(new Waypoint_Time(2,0,.8,false));
////            addSequential(new Waypoint(120,0,.8,false));
//            addSequential(new CmdDriveTrainShiftLowGear());
//            System.out.println("1W");
//        	addSequential(new CmdDropIntake());
//        	System.out.println("2W");
//        	addSequential(new Waypoint(50,0,.7,false));
//        	System.out.println("3W");
//            addSequential(new CmdElevatorSwitch());
//            System.out.println("4W");
//            addSequential(new Wait());
//            System.out.println("5W");
//            addSequential(new Waypoint(30,0,.6,false));
//            System.out.println("6W");
//        }
        else
        {
//        	addSequential(new CmdDriveTrainShiftLowGear());
//            System.out.println("1F");
//        	addSequential(new CmdDropIntake());
//        	System.out.println("2F");
//        	addSequential(new Waypoint(50,0,.7,false));
//        	System.out.println("3F");
//            addSequential(new CmdElevatorSwitch());
//            System.out.println("4F");
//            addSequential(new Wait());
//            System.out.println("5F");
//            addSequential(new Waypoint(30,0,.6,false));
//            System.out.println("6F");

//        	addSequential(new Waypoint_Time(2,0,.8,false));
//            addSequential(new Waypoint(120,0,.8,false));
        }
    }
    // Called just before this Command runs the first time
    @Override
    protected void initialize()
    {
    }
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() //haha 69
    {
    }
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished()
    {
        return false;
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