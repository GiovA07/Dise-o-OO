package remotecontrol.textedit;

public class AddLineCommand implements Command {
  private TextEditor buffer;
  private String line;
  private int index;

  public AddLineCommand(TextEditor buffer, String line, int index) {
    this.buffer = buffer;
    this.line = line;
    this.index = index;
  }

  @Override
  public void execute() {
    buffer.addLine(index, line);
  }

  @Override
  public void undo() {
    buffer.removeLine(index);
  }
}
