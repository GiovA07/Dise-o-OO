package Output.Terminal;

import output.MockTerminal;
import stringcalculator.StringCalculator;
import Logger.Log;
import Logger.ILogger;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalTest {

    @Test
    public void testPrintStringCalcuator() {
        MockTerminal mockTerminal = new MockTerminal();
        ILogger log = new Log();
        StringCalculator str = new StringCalculator(log);
        mockTerminal.print(str.add("//[yzk][///][###]\n1000yzk6///1000yzk5###3###1///2"));
        assertThat(mockTerminal.isInvoked()).isTrue();
    }

}

