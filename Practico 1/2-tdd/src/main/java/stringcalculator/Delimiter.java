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

    int delimiterEndIndex = inputString.indexOf("\n");
    String delimiterLine = inputString.substring(2, delimiterEndIndex);

    takeDelimiters(delimiterLine);
    return delimiterList;
  }

  private void takeDelimiters(String delimiterLine) {
    if (delimiterLine.startsWith("[")) {
        int startIndex = 1;
        while (startIndex < delimiterLine.length()) {
            int endIndex = delimiterLine.indexOf("]", startIndex);
            if (endIndex == -1) {
                break;
            }
            String delimiter = delimiterLine.substring(startIndex, endIndex);
            this.delimiter.add(delimiter);
            startIndex = endIndex + 1;
        }
    } else {
        this.delimiter.add(delimiterLine);
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
