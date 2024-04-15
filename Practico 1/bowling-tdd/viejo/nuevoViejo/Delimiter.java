package stringcalculator;

public class Delimiter {

  private String separator;

  public Delimiter() {
    this.separator = "";
  }

  public Delimiter(String delimiter) {
    this.separator = delimiter;
  }

  public boolean isDelimiterDefault() {
    if (separator == "\n" || separator == ",")
      return true;
    return false;
  }

  public String get_Delimiter() {
    return this.separator;
  }

  public void set_Delimiter(String newDelimiter) {
    this.separator = newDelimiter;
  }


  public String detectDelimiter(String numbers) {
    if (hasDelimiter(numbers)) {
      String newDelimiter = extractDelimiter(numbers);
      return newDelimiter;
    }
    return detectDefaultDelimiter(numbers);
  }

  private boolean hasDelimiter (String numbers) {
    boolean res = false;
    if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
        res = true;
    }
    return res;
  }

  private String extractDelimiter(String numbers) {
    if (numbers.startsWith("//[")) {
        int indexEnd = numbers.indexOf("]\n");
        String delimiter = numbers.substring(3, indexEnd);
        return delimiter;
    }
    return numbers.substring(2, numbers.indexOf("\n"));
  }

  private String detectDefaultDelimiter(String numbers) {
    if (numbers.contains("\n"))
      return "\n";
    return ",";
  }


  public static String removeDelimiter(String numbers) {
    int index = numbers.indexOf('\n');

    if (index != -1)
        numbers = numbers.substring(index + 1);

    return numbers;
  }

}
