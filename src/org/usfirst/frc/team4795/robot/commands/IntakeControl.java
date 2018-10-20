package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeControl extends Command {

	public IntakeControl() {
		requires(Robot.intake);
	}
	
	protected void initialize() {
	}

	protected void execute() {
		if (Robot.oi.getArmRightBumper()) {
			Robot.intake.intake();
		}
		if (Robot.oi.getArmRightTrigger()) {
			Robot.intake.rev();
		}
		if (Robot.oi.getArmRightTriggerReleased()) {
			Robot.intake.shoot();
		}
		Robot.pneumatics.clamp(Robot.oi.getArmButtonA(), Robot.oi.getArmButtonX());
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
