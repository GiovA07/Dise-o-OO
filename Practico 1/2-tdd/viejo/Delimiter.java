package stringcalculator;
import java.util.List;
import java.util.ArrayList;

public class Delimiter {

  private List<String> delimiter;


  public Delimiter() {
    this.delimiter = new ArrayList<>();
    this.delimiter.add(",");
    this.delimiter.add("\n");
  }

  public List<String> getDelimiter() {
    return this.delimiter;
  }

  public List<String> extractDelimiters (String inputString) {
    List<String> delimiterList = new ArrayList<>();

    int delimiterStartIndex = inputString.indexOf("//");
    int delimiterEndIndex = inputString.indexOf("\n", delimiterStartIndex);
    String delimiterLine = inputString.substring(delimiterStartIndex + 2, delimiterEndIndex);

    takeDelimiters(delimiterLine, delimiterList);
    return delimiterList;
  }

  private void takeDelimiters(String delimiterLine, List<String> delimitersList) {
    if (delimiterLine.startsWith("[")) {
      int endIndex = 0;
      while (endIndex != -1) {
        endIndex = delimiterLine.indexOf("]");
        if (endIndex != -1) {
          String delimiter = delimiterLine.substring(1, endIndex);
          delimitersList.add(delimiter);
          delimiterLine = delimiterLine.substring(endIndex + 1);
        }
      }
    } else {
      delimitersList.add(delimiterLine);
    }
  }

  public void addDelimiters(List<String> newDelimiter) {
    for (String string : newDelimiter) {
      delimiter.add(string);
    }
  }

  public static boolean hasDelimiterCustom (String inputStr) {
    boolean res = false;
    if (inputStr.startsWith("//")) {
        res = true;
    }
    return res;
  }

  public static String removeDelimiter(String numbers) {
    int indexEndDelimiter = numbers.indexOf('\n');

    if (indexEndDelimiter != -1)
        numbers = numbers.substring(indexEndDelimiter + 1);

    return numbers;
  }

}
