package simulator;

import simulator.fly.FlyNoWay;
import simulator.quack.NotQuack;

public class WoodenDuck extends Duck{
  public WoodenDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new NotQuack();
  }

  public void display() {
		System.out.println("I'm a wooden duck");
	}
}
