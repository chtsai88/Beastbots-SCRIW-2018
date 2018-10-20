package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmControl extends Command {

	private double throttle;
	
	public ArmControl() {
		requires(Robot.arm);
	}

	protected void initialize() {
	}

	protected void execute() {
		if (Robot.oi.getArmLeftBumper()) {
			throttle = 0.5;
		} else {
			throttle = 1.00;
		}

		Robot.arm.goBitch(throttle * Robot.oi.getArmLeftJoyY());
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
