package remotecontrol.textedit;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

//receiver
public class TextEditor {
  private List<String> lines;

  public TextEditor() {
    lines = new ArrayList<>();
  }

  public List<String> getLines() {
    return lines;
  }

  public void addLine(int index, String line) {
    lines.add(index, line);
  }

  public String removeLine(int index) {
    return lines.remove(index);
  }

  public void print() {
    for (String line : lines) {
        System.out.println(line);
    }
  }

  public void addWord(int lineIndex, int wordIndex, String word) {
    String line = lines.get(lineIndex);
    String[] words = line.split(" ");
    if (wordIndex >= 0 && wordIndex <= word.length()) {
      List<String> wordList = new ArrayList<>(List.of(words));
      wordList.add(wordIndex, word);
      lines.set(lineIndex, String.join(" ", wordList));
    } else {
      throw new InvalidParameterException("Invalid wordIndex");
    }
  }

    public String removeWord(int lineIndex, int wordIndex, String word) {
      String line = lines.get(lineIndex);
      String[] words = line.split(" ");
      if (wordIndex >= 0 && wordIndex <= word.length()) {
        List<String> wordList = new ArrayList<>(List.of(words));
        String wordDelete = wordList.remove(wordIndex);
        lines.set(lineIndex, String.join(" ", wordList));
        return wordDelete;
      } else {
        throw new InvalidParameterException("Invalid wordIndex");
      }
    }

}
