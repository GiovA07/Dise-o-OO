package facade.beverage;

public class Sugar extends CondimentDecorator {
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		return .25 + beverage.cost();
	}
}
