package remotecontrol.texteditnew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
public class AddWordTest {

    private Text textEditor;
    private String newLine;

    @BeforeEach
    public void setUp() {
        textEditor = new Text();
        newLine = "New Line";

        Command command = new AddLineCommand(textEditor, newLine, 0);
        command.execute();
    }

  @Test
  public void addWordExecuteTest() {
    Command addWord = new AddWordCommand(textEditor, "Word", 0, 1);
    addWord.execute();
    List<String> lines = textEditor.getLines();
    assertEquals(lines.get(0), "New Word Line");
  }

  @Test
  public void addWordUndoTest() {
    Command addWord = new AddWordCommand(textEditor, "Word", 0, 1);
    addWord.execute();
    addWord.undo();
    List<String> lines = textEditor.getLines();
    assertEquals(lines.get(0), "New Line");
  }
}
