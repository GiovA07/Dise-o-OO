package remotecontrol.texteditnew;

import java.util.List;
import java.util.Scanner;

public class AddLineCommand implements Command {
  private Text buffer;
  private String line;
  private int index;

  public AddLineCommand(Text buffer) {
    this.buffer = buffer;
  }

  public AddLineCommand(Text buffer, String line, int index) {
    this.buffer = buffer;
    this.line = line;
    this.index = index;
  }

  @Override
  public void execute() {
    List<String> text = buffer.getLines();
    text.add(index, line);
  }

  @Override
  public void undo() {
    Command removeLine = new DeleteLineCommand(buffer, index);
    removeLine.execute();
  }

  @Override
  public void inputCommand() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el texto:");
    this.line = scanner.nextLine();
    System.out.println("Ingresa el index:");
    this.index = scanner.nextInt();
    scanner.nextLine();
  }
}
