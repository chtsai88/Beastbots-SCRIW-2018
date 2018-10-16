package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;

import org.usfirst.frc.team4795.robot.commands.ArmControl;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Arm extends Subsystem {

	private TalonSRX armMotor;
	
	public Arm() {
		armMotor = new TalonSRX(RobotMap.ARM_MOTOR.value);

		Robot.initTalon(armMotor);
	}
	
	public void setMotor(double value) {
		armMotor.set(ControlMode.PercentOutput, value);
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmControl());
	}
}
