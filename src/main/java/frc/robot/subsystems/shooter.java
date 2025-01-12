// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase {

  TalonFX topMotor= new TalonFX(21, "Swervebus");
  TalonFX bottomMotor = new TalonFX (22,"Swervebus");
    /** Creates a new shooter. */
    public shooter() {}

    
    @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootNote(){
    topMotor.set(-0.75);
    Timer.delay(0.25);
    bottomMotor.set(-0.75);
  }

  public void shooterStop(){
    topMotor.set(0);
    bottomMotor.set(0);
  }

  public void intake(){
    topMotor.set(0.25);
    bottomMotor.set(0.25);
  }
}
