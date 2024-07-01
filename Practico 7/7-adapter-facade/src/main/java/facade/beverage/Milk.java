package facade.beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		if (beverage.getSize() == Size.SMALL)
			return .10 + beverage.cost();
		if (beverage.getSize() == Size.MEDIUM)
			return .20 + beverage.cost();
		return .30 + beverage.cost();
	}
}
