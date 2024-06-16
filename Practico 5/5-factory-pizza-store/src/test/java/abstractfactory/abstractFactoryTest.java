package abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pizzastore.abstractfactory.*;
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
    // assertEquals("Criolla Sauce", sauce.toString());

    //Falta peperoni y Clams
  }

  //FactoryStore
  @Test
  public void ArgentinaPizzaStoreTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza cheesePizza = pizzaStore.createPizza("cheese");
    assertEquals("Argentina Style Cheese Pizza", cheesePizza.getName());
  }

  @Test
  public void ArgentinaPizzaStorePizzaNonExistTest(){
    PizzaStore pizzaStore = new ArgentinaPizzaStore();
    Pizza cheesePizza = pizzaStore.createPizza("Acelga");
    assertEquals(null, cheesePizza);

  }
}
