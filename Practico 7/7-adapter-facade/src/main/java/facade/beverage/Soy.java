package facade.beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		if (beverage.getSize() == Size.SMALL)
			return .10 + beverage.cost();
		if (beverage.getSize() == Size.MEDIUM)
			return .15 + beverage.cost();
		return .20 + beverage.cost();
	}
}
