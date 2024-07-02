package remotecontrol.texteditnew;

import java.util.List;
import java.util.Scanner;

public class DeleteLineCommand implements Command {
  private Text buffer;
  private String line;
  private int index;

  public DeleteLineCommand(Text buffer) {
    this.buffer = buffer;
  }

  public DeleteLineCommand(Text buffer, int index) {
    this.buffer = buffer;
    this.index = index;
  }


  @Override
  public void execute() {
    List<String> text = buffer.getLines();
    this.line = text.remove(index);
  }

  @Override
  public void undo() {
    Command addLine = new AddLineCommand(buffer, line, 0);
    addLine.execute();
  }

  @Override
  public void inputCommand() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el index:");
    this.index = scanner.nextInt();
    scanner.nextLine();

  }
}
