package facade.beverage;
import facade.beverage.size.*;

public class Espresso extends Beverage {

	public Espresso(Size size) {
		description = "Espresso " + size.getSize();
		this.size = size;
	}

	public double cost() {
		return 1.99;
	}
}

