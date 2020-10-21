package commands;

import role.Orientation;
import role.Rover;

public class TurnLeftCommand extends Command{
    @Override
    public void execute(Rover rover) {
        rover.turn(Orientation.LEFT);
    }
}
