package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {


	public DriveForward(double timeout) {
		setTimeout(timeout);
	}

	protected void initialize() {
	}
	
	protected void execute() {
		Robot.drivebase.setMotors(.8,.8);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.drivebase.setMotors(0, 0);
	}
}
