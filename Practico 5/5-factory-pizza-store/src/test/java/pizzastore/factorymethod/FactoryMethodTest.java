package pizzastore.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class FactoryMethodTest {
    @Test
    public void ARGPizzaCheeseTest() {
      Pizza pizza = new ARGStyleCheesePizza();

      assertTrue(pizza instanceof ARGStyleCheesePizza);
      assertNotNull(pizza);
      assertEquals("Argentina Style Thick Crust Cheese Pizza", pizza.getName());
      assertEquals("Thick Crust Dough", pizza.dough);
      assertEquals("Tomato Sauce", pizza.sauce);

      List<String> toppings = new ArrayList<>();
      toppings.add("Grated Mozzarella Cheese");

      assertEquals(toppings, pizza.toppings);
    }

    @Test
    public void ARGPizzaVeggieTest() {
      Pizza pizza = new ARGStyleVeggiePizza();

      assertTrue(pizza instanceof ARGStyleVeggiePizza);
      assertNotNull(pizza);
      assertEquals("Argentina Style Vegetable Pizza", pizza.getName());
      assertEquals("Thin Crust Dough", pizza.dough);
      assertEquals("Tomato Basil Sauce", pizza.sauce);

      List<String> toppings = new ArrayList<>();
      toppings.add("Shredded Reggiano Cheese");
      toppings.add("Garlic");
      toppings.add("Onion");
      toppings.add("Mushrooms");
      toppings.add("Red Bell Peppers");

      assertEquals(toppings, pizza.toppings);
    }

    @Test
    public void ARGPizzaClamTest() {
      Pizza pizza = new ARGStyleClamPizza();

      assertTrue(pizza instanceof ARGStyleClamPizza);
      assertNotNull(pizza);
      assertEquals("Argentina Style Seafood Pizza", pizza.getName());
      assertEquals("Thick Crust Dough", pizza.dough);
      assertEquals("Tomato Sauce", pizza.sauce);

      List<String> toppings = new ArrayList<>();
      toppings.add("Grated Mozzarella Cheese");
      toppings.add("Fresh Clams");
      assertEquals(toppings, pizza.toppings);
    }


    @Test
    public void ARGPizzaStoreTest() {
      PizzaStore store = new ARGPizzaStore();
      Pizza pizza = store.createPizza("cheese");
      assertTrue(pizza instanceof ARGStyleCheesePizza);
      assertEquals("Argentina Style Thick Crust Cheese Pizza", pizza.getName());
      assertEquals("Thick Crust Dough", pizza.dough);
      assertEquals("Tomato Sauce", pizza.sauce);
    }

    @Test
    public void ARGPizzaStoreTest2() {
      PizzaStore store = new ARGPizzaStore();
      Pizza pizza = store.createPizza("clam");
      assertTrue(pizza instanceof ARGStyleClamPizza);
      assertEquals("Argentina Style Seafood Pizza", pizza.getName());
      assertEquals("Thick Crust Dough", pizza.dough);
      assertEquals("Tomato Sauce", pizza.sauce);
    }

    @Test
    public void ARGPizzaStoreTest3() {
      PizzaStore store = new ARGPizzaStore();
      Pizza pizza = store.createPizza("veggie");
      assertTrue(pizza instanceof ARGStyleVeggiePizza);
      assertEquals("Argentina Style Vegetable Pizza", pizza.getName());
      assertEquals("Thin Crust Dough", pizza.dough);
      assertEquals("Tomato Basil Sauce", pizza.sauce);
    }
}
