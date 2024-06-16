package remotecontrol.textedit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class TextEditorTest {
  @Test
  public void TextEditorAdd() {
    TextEditor buffer = new TextEditor();
    buffer.addLine(0, "Hi");
    buffer.addLine(1, "how are you?");
    List<String> lines = buffer.getLines();
    assertTrue(lines.size() == 2);
    assertTrue(lines.get(0).equals("Hi"));
    assertTrue(lines.get(1).equals("how are you?"));
  }

  @Test
  public void TextEditorRemove() {
    TextEditor buffer = new TextEditor();
    buffer.addLine(0, "Hi");
    buffer.addLine(1, "how are you?");
    buffer.removeLine(0);
    List<String> lines = buffer.getLines();
    assertTrue(lines.size() == 1);
    assertTrue(lines.get(0).equals("how are you?"));
  }


}
