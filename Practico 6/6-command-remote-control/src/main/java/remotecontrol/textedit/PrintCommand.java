package remotecontrol.textedit;

public class PrintCommand implements Command {
  private TextEditor buffer;

  public PrintCommand(TextEditor buffer) {
      this.buffer = buffer;
  }

  @Override
  public void execute() {
      buffer.print();
  }

  @Override
  public void undo() {
      // NOSE COMO HACER ESTO ??????????????
  }
}
