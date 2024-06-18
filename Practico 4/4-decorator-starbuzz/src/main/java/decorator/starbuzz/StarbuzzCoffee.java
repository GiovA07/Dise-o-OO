package decorator.starbuzz;

import decorator.starbuzz.size.LargeSize;
import decorator.starbuzz.size.MediumSize;
import decorator.starbuzz.size.SmallSize;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		beverage.setSize(new SmallSize());
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(new MediumSize());
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(new MediumSize());
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());

		Beverage beverage4 = new Decaf();
		beverage4.setSize(new LargeSize());
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription()
				+ " $" + beverage4.cost());


		Beverage beverage5 = new Cappuccino();
    	beverage5.setSize(new LargeSize());
    	beverage5 = new Caramel(beverage5);
    	beverage5 = new Mocha(beverage5);
    	beverage5 = new Soy(beverage5);
		System.out.println(beverage5.getDescription()
				+ " $" + beverage5.cost());
	}
}
