package remotecontrol.texteditnew;
import java.util.List;

public class PrintCommand implements Command {
  private Text buffer;

  public PrintCommand(Text buffer) {
      this.buffer = buffer;
  }

  @Override
  public void execute() {
    List<String> text = buffer.getLines();
    for (String line : text) {
        System.out.println(line);
    }
  }

  @Override
  public void undo() {
  }

  @Override
  public void inputCommand() {
  }
}
