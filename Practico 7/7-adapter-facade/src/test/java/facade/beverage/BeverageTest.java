package facade.beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BeverageTest {

    Beverage beverage;
    BeverageFactory factory = new BeverageFactory();

    @Test
    public void testBeverageMacchine() {

        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Classic Coff-MEDIUM-Mocha,Milk,Sugar");

        assertEquals("Clasic Coffee MEDIUM, Mocha, Milk, Sugar", beverage.getDescription());
        assertEquals("Mocha,Milk,Sugar", macchine.getCondiments());
        assertTrue(beverage instanceof Sugar);
    }

    @Test
    public void testBeverageMacchine2() {
        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Dark Coff-LARGE-Milk,Milk");

        assertEquals("Dark Roast Coffee LARGE, Milk, Milk", beverage.getDescription());
        assertEquals("Milk,Milk", macchine.getCondiments());
        assertTrue(beverage instanceof Milk);
    }

    @Test
    public void testBeverageMacchine3() {
        BeverageMacchine macchine = new BeverageMacchine(factory);

        beverage = macchine.prepareBeverage("Decaf Coff-SMALL-Sugar,Whip");

        assertEquals("Decaf Coffee SMALL, Sugar, Whip", beverage.getDescription());
        assertEquals("Sugar,Whip", macchine.getCondiments());
        assertTrue(beverage instanceof Whip);
    }
}
