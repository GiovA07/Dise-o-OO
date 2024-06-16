package decorator.starbuzz.size;

public class SmallSize implements Size {
  public String getSize() {
      return "Pequeño";
  }

  public double cost() {
      return 0;
  }
}
