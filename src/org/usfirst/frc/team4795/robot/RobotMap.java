/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

public enum RobotMap {
	//CAN Motor mappings
	LEFT_MOTOR_ONE(0),
	LEFT_MOTOR_TWO(1),
	LEFT_MOTOR_THREE(2),
	RIGHT_MOTOR_ONE(3),
	RIGHT_MOTOR_TWO(4),
	RIGHT_MOTOR_THREE(5),
	//Controller mappings
	MAIN_CONTROLLER(0),
	LEFT_JOYSTICK(1),
	RIGHT_JOYSTICK(2);
	
	public final int value;
	RobotMap(int value) {

	this.value = value;
	}
}	
	
