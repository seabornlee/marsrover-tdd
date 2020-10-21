package commands;

import role.Rover;

public abstract class Command {
    public abstract void execute(Rover rover);
}
