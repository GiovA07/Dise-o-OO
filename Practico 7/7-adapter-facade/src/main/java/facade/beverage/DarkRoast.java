package facade.beverage;

public class DarkRoast extends Beverage {
	public DarkRoast(Size size) {
		description = "Dark Roast Coffee "+ size;
		this.size = size;
	}
 
	public double cost() {
		return .99;
	}
}

