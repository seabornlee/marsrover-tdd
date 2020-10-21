package commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class CommandParserTest {

    private String commandInString;
    private Class<MoveForwardCommand> classOfCommand;

    public CommandParserTest(String commandInString, Class<MoveForwardCommand> classOfCommand) {
        this.commandInString = commandInString;
        this.classOfCommand = classOfCommand;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"F", MoveForwardCommand.class},
                {"B", MoveBackCommand.class}
        });
    }

    @Test
    public void 解析字符串到命令对象() {
        List<Command> commands = CommandParser.parse(commandInString);
        assertThat(commands).hasSize(1);
        assertThat(commands.get(0)).isInstanceOf(classOfCommand);
    }

}