/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

	private static final double DEADZONE = 0.2;

	public final Joystick CONTROLLER = new Joystick(RobotMap.MAIN_CONTROLLER.value);
	public final Joystick ARM_CONTROLLER = new Joystick(RobotMap.ARM_CONTROLLER.value);

	public double getMainLeftJoyY() {
		final double raw = CONTROLLER.getRawAxis(1);
		return Math.abs(raw) < DEADZONE ? 0.0 : raw;
	}

	public double getMainRightJoyX() {
		final double raw = CONTROLLER.getRawAxis(4);
		return Math.abs(raw) < DEADZONE ? 0.0 : raw;
	}

	public double getMainRightTrigger() {
		return Math.abs(CONTROLLER.getRawAxis(3)) < DEADZONE ? 0.0 : CONTROLLER.getRawAxis(3);
	}
	
	public boolean getMainButtonA() {
		return CONTROLLER.getRawButton(1);
	}

	public boolean getMainButtonX() {
		return CONTROLLER.getRawButton(3);
	}
	
	public double getArmLeftJoyY() {
		final double raw = ARM_CONTROLLER.getRawAxis(1);
		return Math.abs(raw) < DEADZONE ? 0.0 : raw;
	}
	
	public boolean getArmButtonA() {
		return ARM_CONTROLLER.getRawButton(1);
	}

	public boolean getArmButtonX() {
		return ARM_CONTROLLER.getRawButton(3);
	}

	public boolean getArmButtonY() {
		return ARM_CONTROLLER.getRawButton(4);
	}
	
	public boolean rightArmButtonYReleased() {
		return ARM_CONTROLLER.getRawButtonReleased(4);
	}
	
	public boolean getArmRightBumper() {
		return ARM_CONTROLLER.getRawButton(6);
	}

	public boolean getArmLeftBumper() {
		return ARM_CONTROLLER.getRawButton(5);
	}

	public boolean getArmRightTrigger() {
		return ARM_CONTROLLER.getRawButton(8);
	}

	public boolean getArmRightTriggerReleased() {
		return ARM_CONTROLLER.getRawButtonReleased(8);
	}

	public OI() {

	}
}
