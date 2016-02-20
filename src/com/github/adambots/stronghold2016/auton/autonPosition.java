package com.github.adambots.stronghold2016.auton;

import java.util.ArrayList;

import org.usfirst.frc.team245.robot.Sensors;

import com.github.adambots.stronghold2016.drive.Drive;
// saves and call upon different positioning code based on inputs from smart dash
// :TODO implement smart dash into code
// :TODO fine encoder values needed for each positioning code
public class AutonPosition {
	int start;
	int end;
	public AutonPosition(int start,int end){
		this.start = start;
		this.end = end;
	}
	public void autonType(){
		int type = end - start;
		type = type+3;
	ArrayList<Object> pos = new ArrayList <Object>();
		pos.set(0,new SuperRight());
		pos.set(1, new FarRight());
		pos.set(2,new Right());
		pos.set(3, new Forward());
		pos.set(4, new Left());
		pos.set(5 ,new FarLeft());
		
		if(type == 0)
			((SuperRight) pos.get(0)).go();
		else if (type == 1)
			((FarRight) pos.get(1)).go();
		else if (type == 2)
			((Right) pos.get(2)).go();
		else if (type == 3)
			((Forward) pos.get(3)).go();
		else if (type == 4)
			((Left) pos.get(4)).go();
		else if (type == 5)
			((Left) pos.get(5)).go();
		
		
		
	}
	
}
