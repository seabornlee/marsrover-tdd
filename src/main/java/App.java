import role.Commander;
import ui.UI;

public class App {
    public static void main(String[] args) {
        UI ui = new UI();
        String commandsInString = ui.getCommandsInString();
        Commander commander = new Commander();
        String positionAndOrientation = commander.send(commandsInString);
        ui.print(positionAndOrientation);
    }
}
