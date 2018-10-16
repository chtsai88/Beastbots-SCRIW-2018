package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmControl extends Command {

	public ArmControl() {
		requires(Robot.arm);
	}
	
	protected void initialize() {
	}

	protected void execute() {
		if (Robot.oi.getButtonA()) {
			if (Robot.oi.getButtonY()) {
				Robot.arm.setMotor(0.0);
			} else {
				Robot.arm.setMotor(1.0);
			}
		} else if (Robot.oi.getButtonY()) {
			Robot.arm.setMotor(-1.0);
		} else {
			Robot.arm.setMotor(0.0);
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}

}
