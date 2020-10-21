package commands;

import role.Orientation;
import role.Rover;

public class TurnRightCommand extends Command{
    @Override
    public void execute(Rover rover) {
        rover.turn(Orientation.RIGHT);
    }
}
