package remotecontrol.texteditnew;

public class FactoryCommand {
    public Command createCommand(int type, Text buffer) {
        if (type == 1) {
            return new AddLineCommand(buffer);
        } else if (type == 2) {
            return new RemoveWordCommand(buffer);
        } else if (type == 3) {
            return new PrintCommand(buffer);
        } else if (type == 6) {
            return new AddWordCommand(buffer);
        }  else if (type == 7) {
            return new RemoveWordCommand(buffer);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
