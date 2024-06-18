package decorator.starbuzz;

import decorator.starbuzz.size.*;

public class BeverageCreator implements BeverageFactory{
    @Override
    public Beverage createBeverage(String type, Size size) {
        Beverage beverage = null;
        if(type.equals("Capuccino")) {
            beverage = new Cappuccino();
            beverage.setSize(size);
        }else if (type.equals("DarkRoast")) {
            beverage = new DarkRoast();
            beverage.setSize(size);
        } else if (type.equals("Expresso")) {
            beverage = new Espresso();
            beverage.setSize(size);
        } else if (type.equals("Decaf")) {
            beverage = new Decaf();
            beverage.setSize(size);
        }

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
        }
        return null;
    }
}
