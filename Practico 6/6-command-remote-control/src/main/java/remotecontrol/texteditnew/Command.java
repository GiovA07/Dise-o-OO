package remotecontrol.texteditnew;

public interface Command {
	public void inputCommand();
	public void execute();
	public void undo();
}
