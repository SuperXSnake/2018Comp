package org.usfirst.frc295.GrizzlynatorBase.subsystems;

import org.usfirst.frc295.GrizzlynatorBase.Robot;
import org.usfirst.frc295.GrizzlynatorBase.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SysRamp extends Subsystem{

	private DoubleSolenoid PushMain = new DoubleSolenoid(0,RobotMap.PCM_PUSH_SOL, RobotMap.PCM_PUSH_SOL_FOLLOW);
	private DoubleSolenoid LeftSideMain = new DoubleSolenoid(0,RobotMap.PCM_LEFT_SOL,RobotMap.PCM_LEFT_SOL_FOLLOW);
	private Servo PushoutMain = new Servo(RobotMap.PWM_SERVO_RAMP);
	private final DoubleSolenoid.Value RETRACT_SOLENOID = DoubleSolenoid.Value.kReverse;
	private final DoubleSolenoid.Value EXTEND_SOLENOID = DoubleSolenoid.Value.kForward;
	
	private boolean isExtended = false;
	
	public void OpenRamp(){
		//PushoutMain.set(1);//servo
		if (isExtended = false) {
			PushMain.set(EXTEND_SOLENOID);//piston
		}
		if (isExtended = true) {
			PushMain.set(RETRACT_SOLENOID);//piston
		}
	}
	
	public void HoldRamp() {
	}
	
	public void RampRightOpen(){
		//RightSideMain.set(EXTEND_SOLENOID);
		 	
	}
	
	public void RampLeftOpen(){
		LeftSideMain.set(EXTEND_SOLENOID);
		
	}
	
	public void PushupBoth(){
		//RightSideMain.set(EXTEND_SOLENOID);
		LeftSideMain.set(EXTEND_SOLENOID);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	
	
}
