package decorator.starbuzz.size;

public class LargeSize implements Size {
  public String getSize() {
      return "Grande";
  }

  public double cost() {
      return 1.0;
  }
}
