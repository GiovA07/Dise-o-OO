package remotecontrol.textedit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class AddLineTest {
  @Test
  public void addLineExecute() {
    TextEditor textEditor = new TextEditor();
    String newLine = "New Line";
    Command command = new AddLineCommand(textEditor, newLine, 0);
    String newLine2 = "New Line 2";
    Command command2 = new AddLineCommand(textEditor, newLine2, 1);
    command.execute();
    command2.execute();

    List<String> lines = textEditor.getLines();
    assertTrue(lines.size() == 2);
    assertTrue(lines.get(0).equals(newLine));
    assertTrue(lines.get(1).equals(newLine2));
  }

  @Test
  public void addLineUndo() {
    TextEditor textEditor = new TextEditor();
    String newLine = "New Line";
    Command command = new AddLineCommand(textEditor, newLine, 0);
    command.execute();
    command.undo();
    List<String> lines = textEditor.getLines();
    assertTrue(lines.isEmpty());
  }
}
