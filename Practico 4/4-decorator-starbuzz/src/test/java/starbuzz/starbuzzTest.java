package starbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import decorator.starbuzz.*;
import decorator.starbuzz.size.*;

public class starbuzzTest {
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



}
