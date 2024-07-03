package facade.beverage;
import facade.beverage.size.*;

public class HouseBlend extends Beverage {
	public HouseBlend(Size size) {
		description = "House Blend Coffee " + size.getSize();
		this.size = size;
	}

	public double cost() {
		return .89;
	}
}

