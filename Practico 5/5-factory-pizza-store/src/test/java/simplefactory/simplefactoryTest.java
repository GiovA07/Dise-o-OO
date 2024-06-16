package simplefactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import pizzastore.simplefactory.*;

public class simplefactoryTest {
  @Test
  public void argentinaPizzaTest() {
    SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("argentina");
    assertTrue(pizza.getName().equals("Argentina Pizza"));
  }
}
