package facade.beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BeverageTest {

    Beverage beverage;
    BeverageFactory factory = new BeverageFactory();

    @Test
    public void testBeverageCapuccinno() {
        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Cappuccino-LARGE-Milk,Milk");

        assertEquals("Capuccino LARGE, Milk, Milk", beverage.getDescription());
    }

    @Test
    public void testBeverageMacchine() {

        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Classic Coff-MEDIUM-Mocha,Milk,Sugar");

        assertEquals("Clasic Coffee MEDIUM, Mocha, Milk, Sugar", beverage.getDescription());
    }

    @Test
    public void testBeverageMacchine2() {
        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Dark Coff-LARGE-Milk,Milk");

        assertEquals("Dark Roast Coffee LARGE, Milk, Milk", beverage.getDescription());
    }

    @Test
    public void testBeverageMacchine3() {
        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Decaf Coff-SMALL-Sugar,Whip");

        assertEquals("Decaf Coffee SMALL, Sugar, Whip", beverage.getDescription());
    }
}
