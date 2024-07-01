package decorator.starbuzz;

import decorator.starbuzz.size.*;

public class Main {
    public static void main(String[] args) {
        BeverageFactory factory = new BeverageCreator();
        Beverage beverage = factory.createBeverage("Espresso", new SmallSize());
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());

        Beverage beverage2 = factory.createBeverage("DarkRoast", new MediumSize());
        beverage2 = factory.createDecoratedBeverage(beverage2, "Mocha");
        beverage2 = factory.createDecoratedBeverage(beverage2, "Mocha");
        beverage2 = factory.createDecoratedBeverage(beverage2, "Whip");
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

        Beverage beverage3 = factory.createBeverage("HouseBlend", new MediumSize());
        beverage3 = factory.createDecoratedBeverage(beverage3, "Soy");
        beverage3 = factory.createDecoratedBeverage(beverage3, "Mocha");
        beverage3 = factory.createDecoratedBeverage(beverage3, "Whip");
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());


        Beverage beverage4 = factory.createBeverage("Decaf", new LargeSize());
        beverage4 = factory.createDecoratedBeverage(beverage3, "Soy");
        beverage4 = factory.createDecoratedBeverage(beverage3, "Mocha");
        beverage4 = factory.createDecoratedBeverage(beverage3, "Caramel");
        beverage4 = factory.createDecoratedBeverage(beverage3, "Whip");
		System.out.println(beverage4.getDescription()
				+ " $" + beverage4.cost());



        Beverage beverage5 = factory.createBeverage("Capuccino", new LargeSize());
        beverage5 = factory.createDecoratedBeverage(beverage3, "Caramel");
        beverage5 = factory.createDecoratedBeverage(beverage3, "Mocha");
        beverage5 = factory.createDecoratedBeverage(beverage3, "Soy");
		System.out.println(beverage5.getDescription()
				+ " $" + beverage5.cost());
    }
}
