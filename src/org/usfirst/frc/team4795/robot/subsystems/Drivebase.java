/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {

	private TalonSRX rightMotorOne;
	private TalonSRX rightMotorTwo;
	private TalonSRX rightMotorThree;
	private TalonSRX leftMotorOne;
	private TalonSRX leftMotorTwo;
	private TalonSRX leftMotorThree;

	public Drivebase() {
		leftMotorOne = new TalonSRX(RobotMap.LEFT_MOTOR_ONE.value);
		leftMotorTwo = new TalonSRX(RobotMap.LEFT_MOTOR_TWO.value);
		leftMotorThree = new TalonSRX(RobotMap.LEFT_MOTOR_THREE.value);
		rightMotorOne = new TalonSRX(RobotMap.RIGHT_MOTOR_ONE.value);
		rightMotorTwo = new TalonSRX(RobotMap.RIGHT_MOTOR_TWO.value);
		rightMotorThree = new TalonSRX(RobotMap.RIGHT_MOTOR_THREE.value);

		Robot.initTalon(leftMotorOne);
		Robot.initTalon(leftMotorTwo);
		Robot.initTalon(leftMotorThree);
		Robot.initTalon(rightMotorOne);
		Robot.initTalon(rightMotorTwo);
		Robot.initTalon(rightMotorThree);

		leftMotorTwo.follow(leftMotorOne);
		leftMotorThree.follow(leftMotorOne);
		rightMotorTwo.follow(rightMotorOne);
		rightMotorThree.follow(rightMotorOne);
	}

	public void setMotors(double leftValue, double rightValue) {
		leftMotorOne.set(ControlMode.PercentOutput, leftValue);
		rightMotorOne.set(ControlMode.PercentOutput, rightValue);
	}

	public void initDefaultCommand() {
	}
}
