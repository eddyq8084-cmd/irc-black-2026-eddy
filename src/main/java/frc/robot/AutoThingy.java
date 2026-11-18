package frc.robot;


import static edu.wpi.first.units.Units.Seconds;


import org.team4159.commandsv3backport.command3.Command;


import frc.robot.mechanisms.Arm;
import frc.robot.mechanisms.Drivetrain;


public class AutoThingy {
    private AutoThingy(){
    
    public static Command autoCommand(Drivetrain drivetrain, Arm arm) {
        return Command.requiring(drivetrain, arm)
            .executing(coroutine -> {
                coroutine.await(drivetrain.autoDirveCommand(0.25, 0.25).withTimeout(Seconds.of(1)));
            })
            .named("Auto Drive");
    }

    }
   
}
