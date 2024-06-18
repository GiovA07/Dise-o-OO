package simulator;

import simulator.fly.*;
import simulator.quack.*;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		//cambiando fly y quack
		System.out.println("Duck Rubber: ");
		Duck duckRubber = new ModelDuck();
		duckRubber.performFly();
		duckRubber.performQuack();
		duckRubber.setFlyBehavior(new FlyRocketPowered());
		duckRubber.setQuackBehavior(new NotQuack());
		duckRubber.performFly();
		duckRubber.performQuack();

	}

}
