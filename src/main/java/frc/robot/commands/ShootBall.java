package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShootBall extends Command {
    
    private Shooter shooter;
    
    public ShootBall(Shooter shoot) {
        shooter = shoot;
        addRequirements(shooter);
    }
    
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }
    
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}
    
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        shooter.setPower(0);
    }
    
    /*
    @Override
    public boolean isFinished() {
        //no ball in shooter????
    }
    */

}
