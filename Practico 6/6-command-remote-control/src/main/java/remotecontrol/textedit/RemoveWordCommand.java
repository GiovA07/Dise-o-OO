package remotecontrol.textedit;

public class RemoveWordCommand implements Command{
  TextEditor buffer;
  String word;
  int indexLine;
  int indexWord;

  public RemoveWordCommand(TextEditor buffer, String word, int indexLine, int indexWord) {
    this.buffer = buffer;
    this.word = word;
    this.indexLine = indexLine;
    this.indexWord = indexWord;
  }
  @Override
  public void execute() {
    buffer.removeWord(indexLine, indexWord, word);
  }
  @Override
  public void undo() {
    buffer.addWord(indexLine, indexWord, word);
  }

}
