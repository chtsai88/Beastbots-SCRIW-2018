/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4795.robot.Robot;

public class ArcadeDrive extends Command {

	public ArcadeDrive() {
		requires(Robot.drivebase);
	}

	protected void initialize() {

	}

	protected void execute() {

		double left = Robot.oi.getLeftJoyY();
		double right = Robot.oi.getLeftJoyY();

		double turn = Robot.oi.getLeftJoyY() == 0.0 ? Robot.oi.getRightJoyX() * .8 : Robot.oi.getRightJoyX() * 0.4;

		Robot.drivebase.setMotors((left + turn) * 0.6, (right - turn) * 0.6);
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
