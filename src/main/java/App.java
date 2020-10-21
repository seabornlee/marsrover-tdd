import commands.Command;
import commands.CommandParser;
import role.Commander;
import role.Rover;
import ui.UI;

import java.util.List;

public class App {
    public static void main(String[] args) {
        UI ui = new UI();
        String commandsInString = ui.getCommandsInString();
        Commander commander = new Commander();
        List<Command> commands = CommandParser.parse(commandsInString);
        String positionAndOrientation = commander.send(commands);
        ui.print(positionAndOrientation);
    }
}
