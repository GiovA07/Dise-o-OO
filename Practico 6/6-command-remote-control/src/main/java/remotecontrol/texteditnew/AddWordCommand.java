package remotecontrol.texteditnew;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddWordCommand implements Command {
  Text buffer;
  String word;
  int indexLine;
  int indexWord;

  public AddWordCommand(Text buffer) {
    this.buffer = buffer;
  }

  public AddWordCommand(Text buffer, String word, int indexLine, int indexWord) {
    this.buffer = buffer;
    this.word = word;
    this.indexLine = indexLine;
    this.indexWord = indexWord;
  }

  @Override
  public void execute() {
    List<String> text = buffer.getLines();
    String line = text.get(indexLine);
    String[] words = line.split(" ");
    if (indexWord >= 0 && indexWord <= word.length()) {
      List<String> wordList = new ArrayList<>(List.of(words));
      wordList.add(indexWord, word);
      text.set(indexLine, String.join(" ", wordList));
    } else {
      throw new InvalidParameterException("Invalid wordIndex");
    }
  }

  @Override
  public void undo() {
    Command deleteWord = new RemoveWordCommand(buffer, indexLine, indexWord);
    deleteWord.execute();
  }

  @Override
  public void inputCommand() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa la palabra:");
    this.word = scanner.nextLine();
    System.out.println("Ingresa la linea:");
    this.indexLine = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ingresa la posicion que quieres agregarla:");
    this.indexWord = scanner.nextInt();
    scanner.nextLine();
  }

}
