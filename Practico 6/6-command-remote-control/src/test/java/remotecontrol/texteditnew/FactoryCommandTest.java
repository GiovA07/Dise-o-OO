package remotecontrol.texteditnew;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryCommandTest {
    @Test
    public void commandTest() {
        Text buffer = new Text();
        FactoryCommand factory = new FactoryTextCommand();
        Command command = factory.createCommand(1, buffer);
        assertTrue(command instanceof AddLineCommand);
        command = factory.createCommand(2, buffer);
        assertTrue(command instanceof DeleteLineCommand);
        command = factory.createCommand(3, buffer);
        assertTrue(command instanceof PrintCommand);
        command = factory.createCommand(6, buffer);
        assertTrue(command instanceof AddWordCommand);
        command = factory.createCommand(7, buffer);
        assertTrue(command instanceof RemoveWordCommand);


    }
}
