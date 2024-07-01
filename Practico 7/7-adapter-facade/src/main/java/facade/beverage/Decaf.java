package facade.beverage;

public class Decaf extends Beverage {
	public Decaf(Size size) {
		description = "Decaf Coffee " + size;
		this.size = size;
	}
 
	public double cost() {
		return 1.05;
	}
}

