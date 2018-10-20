package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.GearShift;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	private DoubleSolenoid gearShifter;
	private DoubleSolenoid intake;
	private Compressor charles;

	public Pneumatics() {
		gearShifter = new DoubleSolenoid(RobotMap.SHIFT_VALVE_ONE.value, RobotMap.SHIFT_VALVE_TWO.value);
		intake = new DoubleSolenoid(RobotMap.ARM_VALVE_ONE.value, RobotMap.ARM_VALVE_TWO.value);
		gearShifter.set(DoubleSolenoid.Value.kForward);
		charles = new Compressor();
	}

	public void whoosh(boolean bool, boolean boolbool) {
		if (bool) {
			gearShifter.set(DoubleSolenoid.Value.kForward);
		}
		if (boolbool) {
			gearShifter.set(DoubleSolenoid.Value.kReverse);
		}
	}
	
	public void clamp(boolean bool, boolean boolbool) {
		if (bool) {
			intake.set(DoubleSolenoid.Value.kForward);
		}
		if (boolbool) {
			intake.set(DoubleSolenoid.Value.kReverse);
		}
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GearShift());
	}

}
