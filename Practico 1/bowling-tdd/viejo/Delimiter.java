package stringcalculator;

public class Delimiter {

  private String separator;

  public Delimiter() {
    this.separator = "[,\n]";
  }

  public String get_Delimiter() {
    return this.separator;
  }

  public void set_Delimiter(String newDelimiter) {
    this.separator = newDelimiter;
  }


  public static boolean stringHasDelimiter (String numbers) {
    boolean res = false;
    if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
        res = true;
    }
    return res;
  }

  public static String extractDelimiter(String numbers) {
      return numbers.substring(2, numbers.indexOf("\n"));
  }

}
