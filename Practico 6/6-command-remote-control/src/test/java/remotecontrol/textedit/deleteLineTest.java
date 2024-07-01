package remotecontrol.textedit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class deleteLineTest {
    private TextEditor textEditor;
    private String newLine;
    private String newLine2;

    @BeforeEach
    public void setUp() {
        textEditor = new TextEditor();
        newLine = "New Line";
        newLine2 = "New Line 2";

        Command command = new AddLineCommand(textEditor, newLine, 0);
        command.execute();
        command = new AddLineCommand(textEditor, newLine2, 1);
        command.execute();
    }

  @Test
  public void deleteLineCommandExecute() {
    Command deleteCommand = new DeleteLineCommand(textEditor, 0);
    deleteCommand.execute();

    List<String> lines = textEditor.getLines();
    assertTrue(lines.size() == 1);
    assertTrue(lines.get(0).equals(newLine2));
  }

  @Test
  public void deleteLineCommandUndo() {
    Command deleteCommand = new DeleteLineCommand(textEditor, 0);
    deleteCommand.execute();
    deleteCommand.undo();

    List<String> lines = textEditor.getLines();
    assertTrue(lines.size() == 2);
    assertTrue(lines.get(0).equals(newLine));
    assertTrue(lines.get(1).equals(newLine2));
  }

}
