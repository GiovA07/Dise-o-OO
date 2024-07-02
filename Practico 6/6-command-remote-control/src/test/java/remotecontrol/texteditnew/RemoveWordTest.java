package remotecontrol.texteditnew;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveWordTest {
    private Text textEditor;
    private String newLine;

    @BeforeEach
    public void setUp() {
        textEditor = new Text();
        newLine = "New Word Line";
        Command command = new AddLineCommand(textEditor, newLine, 0);
        command.execute();
    }

    @Test
    public void addWordExecuteTest() {
      Command removeWord = new RemoveWordCommand(textEditor, 0, 1);
      removeWord.execute();
      List<String> lines = textEditor.getLines();
      assertEquals(lines.get(0), "New Line");
    }

    @Test
    public void addWordUndoTest() {
      Command removeWord = new RemoveWordCommand(textEditor, 0, 1);
      removeWord.execute();
      removeWord.undo();
      List<String> lines = textEditor.getLines();
      assertEquals(lines.get(0), "New Word Line");
    }
}
