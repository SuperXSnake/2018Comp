package org.usfirst.frc295.GrizzlynatorBase.subsystems;

import org.opencv.core.Mat;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SysCamera extends Subsystem {

	VideoCamera camera1;
	CvSink cvsink1;
	
	CvSource outputStream;
	Mat CamFrame;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public SysCamera() {
    	
    	camera1 = CameraServer.getInstance().startAutomaticCapture(0);
    	camera1.setResolution(320, 240);
    	camera1.setFPS(15);
    	
    	cvsink1 = CameraServer.getInstance().getVideo(camera1);
    	
		cvsink1.setEnabled(true);

    	CamFrame = new Mat();	
    	cvsink1.grabFrame(CamFrame);
    }
    
}

