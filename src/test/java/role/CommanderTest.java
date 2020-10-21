package role;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommanderTest {

    @Test
    public void 发送指令_前进一步() {
        Commander commander = new Commander();
        String result = commander.send("F");
        assertThat(result).isEqualTo("0,1,N");
    }
}