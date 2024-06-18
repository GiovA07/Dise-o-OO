package pizzastore.simplefactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.easymock.EasyMock.*;



public class simplefactoryTest {
  @Test
    public void argentinaPizzaTest() {
      SimplePizzaFactory factory = new SimplePizzaFactory();
      Pizza pizza = factory.createPizza("argentina");

      assertTrue(pizza instanceof ArgentinaPizza);
      assertNotNull(pizza);
      assertEquals("Argentina Pizza", pizza.getName());

      List<String> expectedToppings = new ArrayList<>();
      expectedToppings.add("Mozzarella");
      expectedToppings.add("Sliced ham");
      expectedToppings.add("Green olives");
      expectedToppings.add("Sliced onions");
      expectedToppings.add("Bell peppers");
      expectedToppings.add("Eggs");


      assertEquals(expectedToppings, pizza.toppings);
    }

    @Test
    public void orderPizzaTest() {
        SimplePizzaFactory factoryMock = createMock(SimplePizzaFactory.class);

        Pizza pizzaMock = createMock(ArgentinaPizza.class);

        expect(factoryMock.createPizza("argentina")).andReturn(pizzaMock);

        // comportamiento esperado
        pizzaMock.prepare();
        expectLastCall();
        pizzaMock.bake();
        expectLastCall();
        pizzaMock.cut();
        expectLastCall();
        pizzaMock.box();
        expectLastCall();

        // Activar los mocks
        replay(factoryMock, pizzaMock);

        // Crear una instancia de PizzaStore con el mock de factory
        PizzaStore store = new PizzaStore(factoryMock);

        // Llamar al método a probar
        Pizza pizza = store.orderPizza("argentina");


        assertNotNull(pizza);
        assertEquals(pizzaMock, pizza);

        // Verificar los mocks
        verify(factoryMock, pizzaMock);
    }
}
