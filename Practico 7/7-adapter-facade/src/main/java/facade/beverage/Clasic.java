package facade.beverage;
import facade.beverage.size.*;

public class Clasic  extends Beverage {
	public Clasic(Size size) {
		description = "Clasic Coffee " + size.getSize();
		this.size = size;
	}

	public double cost() {
		return .50;
	}
}
