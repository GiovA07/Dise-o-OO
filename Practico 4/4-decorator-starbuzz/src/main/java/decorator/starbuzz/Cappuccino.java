package decorator.starbuzz;

public class Cappuccino extends Beverage {
  public Cappuccino() {
      description = "Cappuccino";
  }

  public double cost() {
      return 2.49;
  }
}
