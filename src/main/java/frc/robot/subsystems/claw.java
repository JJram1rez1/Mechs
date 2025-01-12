// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class claw extends SubsystemBase {

  TalonFX clawMotor = new TalonFX(23,"Swervebus");

  /** Creates a new claw. */
  public claw() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void idle(){
    clawMotor.set(-0.10);
  }

public void grab(){
    clawMotor.set(-0.75);

  }
  
  public void reverse(){
    clawMotor.set(0.25);
  }
}
