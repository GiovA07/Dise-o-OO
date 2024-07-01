package facade.beverage;

public class HouseBlend extends Beverage {
	public HouseBlend(Size size) { 
		description = "House Blend Coffee " + size;
		this.size = size;
	}
 
	public double cost() {
		return .89;
	}
}

