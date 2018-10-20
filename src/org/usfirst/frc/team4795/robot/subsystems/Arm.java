package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.ArmControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

	private TalonSRX armMotor;
	
	public Arm() {
		armMotor = new TalonSRX(RobotMap.ARM_MOTOR.value);
		
		Robot.initTalon(armMotor);
	}
	
	public void goBitch(double value) {
		armMotor.set(ControlMode.PercentOutput, value);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmControl());
	}

}
