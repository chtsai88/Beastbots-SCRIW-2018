/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

public enum RobotMap {
	//CAN Motor mappings
	LEFT_MOTOR_ONE(1),
	LEFT_MOTOR_TWO(2), //Victor SPX
	LEFT_MOTOR_THREE(3), //Victor SPX
	RIGHT_MOTOR_ONE(4),
	RIGHT_MOTOR_TWO(5), 
	RIGHT_MOTOR_THREE(6), //Victor SPX
	ARM_MOTOR(7),
	//PWM Mapppings
	RIGHT_MOTOR(1), //VictorSP
	LEFT_MOTOR(3), //Spark
	SHOOT_RIGHT(4), //TalonSR
	SHOOT_LEFT(2), //TalonSR
	//Controller mapping
	MAIN_CONTROLLER(0),
	ARM_CONTROLLER(1),
	//Pneumatics
	SHIFT_VALVE_ONE(0),
	SHIFT_VALVE_TWO(1),
	ARM_VALVE_ONE(2),
	ARM_VALVE_TWO(3);
	
	public final int value;
	
	RobotMap(int value) {

	this.value = value;
	}
}	
	
