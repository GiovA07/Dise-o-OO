package remotecontrol.textedit;

public class AddWordCommand implements Command{
  TextEditor buffer;
  String word;
  int indexLine;
  int indexWord;

  public AddWordCommand(TextEditor buffer, String word, int indexLine, int indexWord) {
    this.buffer = buffer;
    this.word = word;
    this.indexLine = indexLine;
    this.indexWord = indexWord;
  }
  @Override
  public void execute() {
    buffer.addWord(indexLine, indexWord, word);
  }
  @Override
  public void undo() {
    buffer.removeWord(indexLine, indexWord, word);
  }

}
