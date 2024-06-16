package remotecontrol.remotewithunduredo;

import java.util.Stack;

public class RemoteControlWithUndoRedo {
    private Command[] onCommands;
    private Command[] offCommands;

    private Stack<Command> undoStack;
    private Stack<Command> redoStack;
    private int maxSize;

    public RemoteControlWithUndoRedo(int k) {
      onCommands = new Command[7];
      offCommands = new Command[7];
      Command noCommand = new NoCommand();
      for(int i=0;i<7;i++) {
        onCommands[i] = noCommand;
        offCommands[i] = noCommand;
      }

      undoStack = new Stack<>();
      redoStack = new Stack<>();
      this.maxSize = k;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
      onCommands[slot] = onCommand;
      offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
      onCommands[slot].execute();
      addCommandToUndoStack(onCommands[slot]);
      redoStack.clear();
    }


    public void offButtonWasPushed(int slot) {
      offCommands[slot].execute();
      addCommandToUndoStack(offCommands[slot]);
      redoStack.clear();
    }

    private void addCommandToUndoStack(Command command) {
      if (undoStack.size() == maxSize) {
          undoStack.remove(0);
      }
      undoStack.push(command);
    }

    public void undoButtonWasPushed() {
      if (!undoStack.isEmpty()) {
          Command command = undoStack.pop();
          command.undo();
          redoStack.push(command);
      }
    }

    public void redoButtonWasPushed() {
      if (!redoStack.isEmpty()) {
          Command command = redoStack.pop();
          command.execute();
          undoStack.push(command);
      }
   }

   @Override
  public String toString() {
    StringBuilder stringBuff = new StringBuilder();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
        stringBuff.append("[slot ").append(i).append("] ")
                  .append(onCommands[i].getClass().getName())
                  .append("    ")
                  .append(offCommands[i].getClass().getName())
                  .append("\n");
    }
    return stringBuff.toString();
  }


}
