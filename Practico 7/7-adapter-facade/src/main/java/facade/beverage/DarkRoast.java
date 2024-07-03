package facade.beverage;
import facade.beverage.size.*;

public class DarkRoast extends Beverage {
	public DarkRoast(Size size) {
		description = "Dark Roast Coffee "+ size.getSize();
		this.size = size;
	}

	public double cost() {
		return .99;
	}
}

