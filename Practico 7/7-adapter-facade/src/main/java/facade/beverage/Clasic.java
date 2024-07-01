package facade.beverage;

public class Clasic  extends Beverage {
	public Clasic(Size size) {
		description = "Clasic Coffee " + size;
		this.size = size;
	}
 
	public double cost() {
		return .50;
	}
}
