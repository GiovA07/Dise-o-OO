package facade.beverage;

public class Caramel extends CondimentDecorator {
  public Caramel(Beverage beverage) {
      this.beverage = beverage;
      setSize(beverage.getSize());
  }

  public String getDescription() {
      return beverage.getDescription() + ", Caramel";
  }

  public double cost() {
      return .30 + beverage.getCostSize() + beverage.cost();
  }
}
