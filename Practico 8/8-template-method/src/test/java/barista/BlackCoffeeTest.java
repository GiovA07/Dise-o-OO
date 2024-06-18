package barista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class BlackCoffeeTest {

    @Test
    public void testBlackCoffWithoutCondiments() {
        BlackCoffee blackCoffee = new BlackCoffee();
        blackCoffee.prepareRecipe();

        assertEquals("Dripping black coffee through filter", blackCoffee.getChanges());
    }

    @Test
    public void testBlackCoffWithoutCondiments2() {
        BlackCoffee blackCoffee = new BlackCoffee();
        blackCoffee.prepareRecipe();

        assertEquals("Dripping black coffee through filter", blackCoffee.getChanges());
        assertFalse(blackCoffee.addIt());
    }
}
