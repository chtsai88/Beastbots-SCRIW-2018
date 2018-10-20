/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command {

	public ArcadeDrive() {
		requires(Robot.drivebase);
	}

	protected void initialize() {
	}

	protected void execute() {
		double throttle = 0.9 - (0.4 * Robot.oi.getMainRightTrigger());
		double turn = Robot.oi.getMainLeftJoyY() == 0.0 ? Robot.oi.getMainRightJoyX() * .8 : Robot.oi.getMainRightJoyX() * 0.5;

		Robot.drivebase.setMotors((Robot.oi.getMainLeftJoyY() + turn) * throttle, (Robot.oi.getMainLeftJoyY() - turn) * throttle);
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
