package stringcalculator;

public class Delimiter {

  private String separator;
  private String[] multDelimiter;

  public Delimiter() {
    this.separator = "";
  }

  public Delimiter(String delimiter) {
    this.separator = delimiter;
  }

  public String getDelimiter() {
    return this.separator;
  }

  public String[] getMultDelimiter() {
    return multDelimiter;
  }

  public boolean isDelimiterDefault() {
    if (separator == "\n" || separator == ",")
      return true;
    return false;
  }

  public void detectDelimiter(String inputStr) {
    if (hasDelimiter(inputStr)) {
      String newDelimiter = extractDelimiter(inputStr);
      if (newDelimiter.contains("][")) {
        multDelimiter = newDelimiter.split("\\]\\[");
      }
      separator = newDelimiter;
    } else {
      separator = detectDefaultDelimiter(inputStr);
    }
  }

  private boolean hasDelimiter (String inputStr) {
    boolean res = false;
    if (inputStr.startsWith("//")) {
        res = true;
    }
    return res;
  }

  private String extractDelimiter(String inputStr) {
    if (inputStr.startsWith("//[")) {

        return extractMultiDelimiter(inputStr);
    }
    int indexStartDelimiter = 2;
    int indexEndDelimtier = inputStr.indexOf("\n");
    return inputStr.substring(indexStartDelimiter, indexEndDelimtier);
  }

  private String extractMultiDelimiter (String inputStr) {
    int indexStartDelimiter = 3;
    int indexEndDelimtier = inputStr.indexOf("]\n");
    String delimiter = inputStr.substring(indexStartDelimiter, indexEndDelimtier);
    return delimiter;
  }

  private String detectDefaultDelimiter(String numbers) {
    if (numbers.contains("\n"))
      return "\n";
    return ",";
  }


  public static String removeDelimiter(String numbers) {
    int indexEndDelimiter = numbers.indexOf('\n');

    if (indexEndDelimiter != -1)
        numbers = numbers.substring(indexEndDelimiter + 1);

    return numbers;
  }

  public boolean isMultiDelimiters() {
    if(multDelimiter != null) {
      return true;
    }
    return false;
  }

}
