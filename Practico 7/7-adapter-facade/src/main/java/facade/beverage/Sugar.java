package facade.beverage;

public class Sugar extends CondimentDecorator {
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		if (beverage.getSize() == Size.SMALL)
			return .15 + beverage.cost();
		if (beverage.getSize() == Size.MEDIUM)
			return .20 + beverage.cost();
		return .25 + beverage.cost();
	}
}
