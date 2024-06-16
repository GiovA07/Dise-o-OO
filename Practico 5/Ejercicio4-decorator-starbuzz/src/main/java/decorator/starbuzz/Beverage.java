package decorator.starbuzz;

import decorator.starbuzz.size.Size;

public abstract class Beverage {
	String description = "Unknown Beverage";
  Size size;

	public String getDescription() {
		return description;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return this.size;
	}

	public double getCostSize() {
		return size.cost();
	}

	public abstract double cost();
}
