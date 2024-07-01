package facade.beverage;

public class Espresso extends Beverage {
  
	public Espresso(Size size) {
		description = "Espresso " + size;
		this.size = size;
	}
  
	public double cost() {
		return 1.99;
	}
}

