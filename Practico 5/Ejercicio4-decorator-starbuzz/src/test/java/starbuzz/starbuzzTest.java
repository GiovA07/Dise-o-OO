package starbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import decorator.starbuzz.*;
import decorator.starbuzz.size.*;

public class starbuzzTest {
  //bebidas
  @Test
  public void doubleMochaSoyLatteWithWhip(){
    Beverage beverage = new HouseBlend();
    beverage.setSize(new LargeSize());
    beverage = new Soy(beverage);      // Añadir soja
    beverage = new Mocha(beverage);   // mocha
    beverage = new Mocha(beverage);  // otro mocha
    beverage = new Whip(beverage);  //crema batida
    assertEquals(4.49, beverage.cost());
    assertEquals("House Blend Coffee, Soy, Mocha, Mocha, Whip", beverage.getDescription());
  }

  //bebidas
  @Test
  public void cappuccinoTest() {
    Beverage beverage = new Cappuccino();
    assertEquals(2.49, beverage.cost());
  }

  @Test
  public void cappuccinoWithCaramelTest() {
    Beverage beverage = new Cappuccino();
    beverage.setSize(new SmallSize());
    beverage = new Caramel(beverage);
    assertEquals(2.49 + .30, beverage.cost());
    assertEquals("Cappuccino, Caramel", beverage.getDescription());
  }

  @Test
  public void largeCappuccinoWithCondimentsCost() {
    Beverage beverage = new Cappuccino();
    beverage.setSize(new LargeSize());
    beverage = new Caramel(beverage);
    beverage = new Mocha(beverage);
    beverage = new Soy(beverage);
    assertEquals(2.49 + (1.30) + (1.20) + (1.10), beverage.cost());
    assertEquals("Cappuccino, Caramel, Mocha, Soy", beverage.getDescription());
  }

  @Test
  public void mediumCappuccinoWithCondimentsCost() {
    Beverage beverage = new Cappuccino();
    beverage.setSize(new MediumSize());
    beverage = new Caramel(beverage);
    beverage = new Mocha(beverage);
    beverage = new Soy(beverage);
    assertEquals(2.49 + (.35) + (.25) + (.15), beverage.cost());
    assertEquals("Cappuccino, Caramel, Mocha, Soy", beverage.getDescription());
  }


  //Factory
  @Test
  public void BeverageFactory() {
    BeverageFactory factory = new BeverageCreator();
    Beverage beverage = factory.createBeverage("Capuccino", new MediumSize());
    beverage = factory.createDecoratedBeverage(beverage, "Caramel");
    beverage = factory.createDecoratedBeverage(beverage, "Mocha");
    beverage = factory.createDecoratedBeverage(beverage, "Soy");

    assertEquals(2.49 + (.35) + (.25) + (.15), beverage.cost());
    assertEquals("Cappuccino, Caramel, Mocha, Soy", beverage.getDescription());
  }

}
