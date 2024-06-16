package textedit;

public class AddLine implements Command {
    private TextEditor buffer;
    private String line;
    private int index;

    public AddLine(TextEditor buffer, String line, int index) {
        this.buffer = buffer;
        this.line = line;
        this.index = index;
    }

    @Override
    public void execute() {
        buffer.ad(index, line);
    }

    @Override
    public void undo() {
        buffer.removeLine(index);
    }
}
}
