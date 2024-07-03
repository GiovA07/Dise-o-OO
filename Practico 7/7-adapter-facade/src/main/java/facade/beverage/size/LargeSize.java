package facade.beverage.size;

public class LargeSize extends Size {
  public String getSize() {
      return "LARGE";
  }

  public double cost() {
      return 1.0;
  }
}
