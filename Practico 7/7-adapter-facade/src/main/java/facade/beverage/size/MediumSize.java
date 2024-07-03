package facade.beverage.size;

public class MediumSize extends Size {
  public String getSize() {
      return "MEDIUM";
  }

  public double cost() {
      return 0.05;
  }
}
