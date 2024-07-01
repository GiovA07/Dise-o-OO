package decorator.starbuzz;

import decorator.starbuzz.size.*;

public class BeverageCreator implements BeverageFactory{
    @Override
    public Beverage createBeverage(String type, Size size) {
        Beverage beverage;
        if(type.equals("Capuccino")) {
            beverage = new Cappuccino();
        }else if (type.equals("DarkRoast")) {
            beverage = new DarkRoast();
        } else if (type.equals("Espresso")) {
            beverage = new Espresso();
        } else if (type.equals("Decaf")) {
            beverage = new Decaf();
        } else if (type.equals("HouseBlend")) {
            beverage = new HouseBlend();
        } else {
            throw new IllegalArgumentException();
        }
        beverage.setSize(size);
        return beverage;
    }
    @Override
    public Beverage createDecoratedBeverage(Beverage beverage, String decorate) {
        if(decorate.equals("Caramel")) {
            return new Caramel(beverage);
        }else if (decorate.equals("Soy")) {
            return new Soy(beverage);
        } else if (decorate.equals("Milk")) {
            return new Milk(beverage);
        } else if (decorate.equals("Mocha")) {
            return new Mocha(beverage);
        } else if (decorate.equals("Whip")) {
            return new Whip(beverage);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
