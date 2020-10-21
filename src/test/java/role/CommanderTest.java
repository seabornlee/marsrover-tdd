package role;

import commands.*;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommanderTest {

    @Test
    public void 发送单条指令() {
        Commander commander = new Commander();
        String position = commander.send(singletonList(new MoveForwardCommand()));
        assertThat(position).isEqualTo("0,1,N");
    }

    @Test
    public void 发送多条指令() {
        Commander commander = new Commander();
        String position = commander.send(Arrays.asList(new MoveForwardCommand(), new MoveBackCommand()));
        assertThat(position).isEqualTo("0,0,N");
    }
}