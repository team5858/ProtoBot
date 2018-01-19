// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5858.ProtoBot.subsystems;

import org.usfirst.frc5858.ProtoBot.RobotMap;
//import org.usfirst.frc5858.ProtoBot.commands.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Shooter extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	private final SpeedController topLeft = RobotMap.shooterTopLeft;
	private final SpeedController topRight = RobotMap.shooterTopRight;
	private final SpeedController bottomLeft = RobotMap.shooterBottomLeft;
	private final SpeedController bottomRight = RobotMap.shooterBottomRight;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public double getPower() {
		/*boolean button = SmartDashboard.getBoolean("DB/Button 0", false);
		double power = SmartDashboard.getNumber("DB/Slider 0", 0.0) / 5.0;

		if (button == true) {
			power = power * -1.0;
		}

		SmartDashboard.putString("DB/String 0", String.valueOf(power));*/
		double power = 1.0;

		return power;
	}

	public void RunForwards() {
		double power = getPower();

		topLeft.set(power);
		topRight.set(-power);
		bottomLeft.set(power);
		bottomRight.set(-power);
	}

	public void RunBackwards() { 

		double power = getPower();

		topLeft.set(-power);
		topRight.set(power);
		bottomLeft.set(-power);
		bottomRight.set(power);
	}

	public void Stop() {
		topLeft.set(0.0);
		topRight.set(0.0);
		bottomLeft.set(0.0);
		bottomRight.set(0.0);
	}
}
