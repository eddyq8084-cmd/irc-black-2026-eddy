package frc.robot;


import static edu.wpi.first.units.Units.Seconds;


import org.team4159.commandsv3backport.command3.Command;


import frc.robot.mechanisms.Arm;
import frc.robot.mechanisms.Drivetrain;


public class AutoThingy {
    private AutoThingy(){
    
    public static Command autoCommand(Drivetrain drivetrain, Shooter shooter) {
        return Command.requiring(drivetrain, shooter)
            .executing(coroutine -> {
                drivetrain.drive(0.5, 0.0);
                coroutine.delay(Seconds(2));
                drivetrain.drive(0.0, 0.0);
            })
    }

    }
   
}
