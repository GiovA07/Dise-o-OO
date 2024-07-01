package remotecontrol.textedit;

public class DeleteLineCommand implements Command {
  private TextEditor buffer;
  private String line;
  private int index;

  public DeleteLineCommand(TextEditor buffer, int index) {
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
