package facade.beverage;

import facade.beverage.size.Size;

public class Cappuccino extends Beverage {
	public Cappuccino(Size size) {
		description = "Capuccino " + size.getSize();
		this.size = size;
	}
  public double cost() {
      return 2.49;
  }
}
