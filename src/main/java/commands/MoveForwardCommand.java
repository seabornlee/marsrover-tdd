package commands;

import role.Rover;

public class MoveForwardCommand extends Command {
    @Override
    public void execute(Rover rover) {
        rover.move(1);
    }
}
