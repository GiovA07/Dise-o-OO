package remotecontrol.textedit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminCommandTest {
    private TextEditor textEditor;
    private AdminCommands adminCommands;

    @BeforeEach
    public void setUp() {
        textEditor = new TextEditor();
        adminCommands = new AdminCommands();
    }

    @Test
    public void testExecuteCommand() {
        Command commandAdd = new AddLineCommand(textEditor, "New Line", 0);
        adminCommands.executeCommand(commandAdd);

        assertEquals(1, textEditor.getLines().size());
        assertEquals("New Line", textEditor.getLines().get(0));
    }

    @Test
    public void testUndo() {
        Command addLineCommand = new AddLineCommand(textEditor, "New Line", 0);
        adminCommands.executeCommand(addLineCommand);
        adminCommands.undo();

        assertTrue(textEditor.getLines().isEmpty());
    }


    @Test
    public void testRedo() {
        Command addLineCommand = new AddLineCommand(textEditor, "New Line", 0);
        adminCommands.executeCommand(addLineCommand);
        adminCommands.undo();
        adminCommands.redo();

        assertEquals(1, textEditor.getLines().size());
        assertEquals("New Line", textEditor.getLines().get(0));
    }

    @Test
    public void testPrintCommandDoesNotAffectUndoRedo() {
        Command addLineCommand = new AddLineCommand(textEditor, "New Line", 0);
        Command printCommand = new PrintCommand(textEditor);

        adminCommands.executeCommand(addLineCommand);
        adminCommands.executeCommand(printCommand);
        adminCommands.undo();

        assertEquals(0, textEditor.getLines().size());
    }
}
