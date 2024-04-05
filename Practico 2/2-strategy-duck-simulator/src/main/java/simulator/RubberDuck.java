package simulator;

import simulator.fly.FlyNoWay;
import simulator.quack.Squeak;

public class RubberDuck extends Duck{

  public RubberDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Squeak();
  }

  public void display() {
		System.out.println("I'm a rubber duck");
	}
}
