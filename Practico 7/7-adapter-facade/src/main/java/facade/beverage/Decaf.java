package facade.beverage;
import facade.beverage.size.*;

public class Decaf extends Beverage {
	public Decaf(Size size) {
		description = "Decaf Coffee " + size.getSize();
		this.size = size;
	}

	public double cost() {
		return 1.05;
	}
}

