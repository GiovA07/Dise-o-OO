package textedit;

public interface Command {
	public void execute();
	public void undo();
}
