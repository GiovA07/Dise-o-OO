package remotecontrol.textedit;

public class AdminCommands {
  Command undo = new NoCommand();
  Command redo = new NoCommand();

  public void executeCommand(Command command) {
    command.execute();
    if (!(command instanceof PrintCommand)) {
      undo = command;
      redo = new NoCommand();
    }
  }

  public void undo() {
    undo.undo();
    redo = undo;
    undo = new NoCommand();
  }

  public void redo() {
      redo.execute();
      undo = redo;
      redo = new NoCommand();
  }
}
