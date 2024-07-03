package remotecontrol.texteditnew;

public interface FactoryCommand {
    Command createCommand(int type, Text buffer);
}
