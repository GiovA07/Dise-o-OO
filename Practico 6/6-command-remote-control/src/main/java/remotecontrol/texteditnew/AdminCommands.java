package remotecontrol.texteditnew;

import java.util.Stack;

public class AdminCommands {
    private FactoryCommand factory;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public AdminCommands(FactoryCommand factoryCommand) {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        this.factory = factoryCommand;
    }

    public void executeCommand(int numCommand, Text buffer) {
        Command command = factory.createCommand(numCommand, buffer);
        command.inputCommand();
        command.execute();
        if (!(command instanceof PrintCommand))
            undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }
}
