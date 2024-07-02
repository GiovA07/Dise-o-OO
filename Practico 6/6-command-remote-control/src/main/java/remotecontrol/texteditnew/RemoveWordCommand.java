package remotecontrol.texteditnew;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveWordCommand implements Command{
  Text buffer;
  String word;
  int indexLine;
  int indexWord;

  public RemoveWordCommand(Text buffer) {
    this.buffer = buffer;
  }

  public RemoveWordCommand(Text buffer, int indexLine, int indexWord) {
    this.buffer = buffer;
    this.indexLine = indexLine;
    this.indexWord = indexWord;
  }

  @Override
  public void execute() {
    List<String> text = buffer.getLines();
    if (indexLine >= 0 && indexLine < text.size()) {
        String line = text.get(indexLine);
        String[] words = line.split(" ");
        if (indexWord >= 0 && indexWord < words.length) {
            this.word = words[indexWord];

            StringBuilder newLine = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (i != indexWord) {
                    newLine.append(words[i]);
                    newLine.append(" ");
                }
            }
            text.set(indexLine, newLine.toString().trim());
        }
    }
}


  @Override
  public void undo() {
    Command addWord = new AddWordCommand(buffer,word, indexLine, indexWord);
    addWord.execute();
  }

  @Override
  public void inputCommand() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa la linea:");
    this.indexLine = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ingresa la posicion que quieres eliminar la palabra:");
    this.indexWord = scanner.nextInt();
    scanner.nextLine();

  }

}
