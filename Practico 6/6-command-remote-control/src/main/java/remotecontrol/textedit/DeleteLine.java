package remotecontrol.textedit;

public class DeleteLine implements Command {
  private TextEditor buffer;
  private String line;
  private int index;

  public DeleteLine(TextEditor buffer, int index) {
    this.buffer = buffer;
    this.index = index;
  }

  @Override
  public void execute() {
    this.line = buffer.removeLine(index);

  }
  @Override
  public void undo() {
    buffer.addLine(index, line);

  }
}
