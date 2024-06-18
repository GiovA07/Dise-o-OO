package pizzastore.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import pizzastore.abstractfactory.Argentina.*;

public class abstractFactoryTest {
  //Cheese
  @Test
  public void testCreamChesse() {
    Cheese cheese = new CreamCheese();
    assertEquals("Cream Cheese", cheese.toString());
  }

  //Dough
  @Test
  public void testArgentinaDough() {
    Dough dough = new ArgentinaDough();
    assertEquals("Argentina Dough", dough.toString());
  }

  //Veggies
  @Test
  public void testArgentinaVeggie() {
    Veggies veggie = new GreenOlives();
    assertEquals("Green Olives", veggie.toString());
  }
  @Test
  public void testArgentinaVeggie2() {
    Veggies veggie = new TomatoVeggie();
    assertEquals("Tomato", veggie.toString());
  }

  //IngredientFactory
  @Test
  public void IngredientFactoryCreateDough() {
    PizzaIngredientFactory factory = new ArgentinaPizzaIngredientFactory();

    Dough dough = factory.createDough();
    assertEquals("Argentina Dough", dough.toString());

    Sauce sauce = factory.createSauce();
    assertEquals("Criolla Sauce", sauce.toString());

    Cheese cheese = factory.createCheese();
    assertEquals("Cream Cheese", cheese.toString());

    Veggies[] veggies = factory.createVeggies();
    assertTrue(veggies.length == 2);
    assertEquals("Tomato", veggies[0].toString());
    assertEquals("Green Olives", veggies[1].toString());

    Clams clam = factory.createClam();
    assertEquals("Frozen Clams from Chesapeake Bay", clam.toString());

    Pepperoni peperoni = factory.createPepperoni();
    assertEquals("Sliced Pepperoni", peperoni.toString());

  }

  //FactoryStore
  @Test
  public void ArgentinaPizzaStoreCheeseTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza cheesePizza = pizzaStore.orderPizza("cheese");
    assertTrue(cheesePizza.dough instanceof ArgentinaDough);
    assertTrue(cheesePizza.cheese instanceof CreamCheese);
    assertTrue(cheesePizza.sauce instanceof CriollaSauce);

    assertEquals("Argentina Style Cheese Pizza", cheesePizza.getName());
  }

  @Test
  public void ArgentinaPizzaStoreClamTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza cheesePizza = pizzaStore.orderPizza("clam");
    assertTrue(cheesePizza.dough instanceof ArgentinaDough);
    assertTrue(cheesePizza.cheese instanceof CreamCheese);
    assertTrue(cheesePizza.sauce instanceof CriollaSauce);
    assertTrue(cheesePizza.clam instanceof FrozenClams);

    assertEquals("Argentina Style Clam Pizza", cheesePizza.getName());
  }

  @Test
  public void ArgentinaPizzaStoreVeggieTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza pizza = pizzaStore.orderPizza("veggie");
    assertTrue(pizza.dough instanceof ArgentinaDough);
    assertTrue(pizza.cheese instanceof CreamCheese);
    assertTrue(pizza.sauce instanceof CriollaSauce);
    assertTrue(pizza.veggies.length == 2);
    assertEquals("Tomato", pizza.veggies[0].toString());
    assertEquals("Green Olives", pizza.veggies[1].toString());
    assertEquals("Argentina Style Veggie Pizza", pizza.getName());
  }


  @Test
  public void ArgentinaPizzaStorePizzaNonExistTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza cheesePizza = pizzaStore.createPizza("Acelga");
    assertEquals(null, cheesePizza);

  }
}
