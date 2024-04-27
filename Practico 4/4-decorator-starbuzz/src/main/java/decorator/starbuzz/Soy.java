package decorator.starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());

	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .10 + beverage.getCostSize() + beverage.cost();
	}
}
