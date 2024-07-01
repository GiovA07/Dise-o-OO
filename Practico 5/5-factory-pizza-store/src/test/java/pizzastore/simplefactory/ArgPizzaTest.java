package pizzastore.simplefactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArgPizzaTest {
    @Test
    public void PizzaArgentinaTest() {
        Pizza pizza = new ArgentinaPizza();
        assertTrue(pizza.getName() == "Argentina Pizza");
        assertTrue(pizza.dough == "Traditional Argentine dough");
        assertTrue(pizza.sauce == "Criolla sauce");
    }
}
