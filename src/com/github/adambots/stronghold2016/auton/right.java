package com.github.adambots.stronghold2016.auton;

import org.usfirst.frc.team245.robot.Actuators;
import org.usfirst.frc.team245.robot.Sensors;

import com.github.adambots.stronghold2016.drive.Drive;

public class Right {
	static double turnamountL = 0, turnamountR = 0, driveDistance =0,finishDistance = 0;
	double turned;
	double inPosition;
	boolean done;
	double turned2;
	public Right(){
	}
	public void go(){
			turned  = Actuators.getLeftDriveMotor().getError();
			inPosition  = Actuators.getLeftDriveMotor().getError();
			turned2  = Actuators.getLeftDriveMotor().getError();
			turned  = Actuators.getLeftDriveMotor().getError();
			if (Math.abs(turned) < 100)
				Drive.drive(Actuators.STOP_MOTOR);
			else{
				Drive.driveWithPID(turnamountL, -turnamountR);
			}	
			if (Math.abs(inPosition) > 100 && Math.abs(turned) < 100)
				Drive.driveWithPID(driveDistance, driveDistance);
			else{
				Drive.drive(Actuators.STOP_MOTOR);
			}

			if (Math.abs(inPosition) < 100 && Math.abs(turned2) > 100)
				Drive.driveWithPID(-turnamountL, turnamountR);
			else{
				Drive.drive(Actuators.STOP_MOTOR);
			}
			if (Math.abs(inPosition) < 100 && Math.abs(turned2) < 100)
				Drive.driveWithPID(finishDistance, finishDistance);
			else{
				Drive.drive(Actuators.STOP_MOTOR);
			}
		}
}
