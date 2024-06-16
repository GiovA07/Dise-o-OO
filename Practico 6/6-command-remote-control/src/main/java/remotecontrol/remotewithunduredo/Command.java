package remotecontrol.remotewithunduredo;

public interface Command {
	public void execute();
	public void undo();
}
