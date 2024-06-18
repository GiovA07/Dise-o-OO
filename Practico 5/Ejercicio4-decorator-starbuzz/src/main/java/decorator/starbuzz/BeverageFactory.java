package decorator.starbuzz;

import decorator.starbuzz.size.Size;

public interface BeverageFactory {
    Beverage createBeverage(String type, Size size);
    Beverage createDecoratedBeverage(Beverage beverage, String decorate);
}
