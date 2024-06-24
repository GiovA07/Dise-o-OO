package simulator;

import org.junit.jupiter.api.Test;

import simulator.fly.*;
import simulator.quack.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class DuckTest {

    @Test
    public void performTest() {
        Duck rubberDuck = mock(RubberDuck.class);
        rubberDuck.performFly();
        rubberDuck.performQuack();

        verify(rubberDuck).performFly();
        verify(rubberDuck).performQuack();
    }

    @Test
    public void performTest2() {

        Duck rubberDuck = new RubberDuck();
        assertTrue(rubberDuck.flyBehavior instanceof FlyNoWay);
        assertTrue(rubberDuck.quackBehavior instanceof Squeak);

    }

    @Test
    public void modifyQuackAndFlyTest() {
        Duck rubberDuck = new RubberDuck();

        QuackBehavior newQuack = mock(NotQuack.class);
        FlyBehavior newFly = mock(FlyRocketPowered.class);

        rubberDuck.setQuackBehavior(newQuack);
        rubberDuck.setFlyBehavior(newFly);

        rubberDuck.performQuack();
        rubberDuck.performFly();

        verify(newQuack).quack();
        verify(newFly).fly();

    }


    @Test
    public void modifyQuackAndFlyTest2() {
        Duck duck = new WoodenDuck();

        QuackBehavior newQuack = mock(Squeak.class);
        FlyBehavior newFly = mock(FlyWithWings.class);

        duck.setQuackBehavior(newQuack);
        duck.setFlyBehavior(newFly);

        duck.performQuack();
        duck.performFly();

        verify(newQuack).quack();
        verify(newFly).fly();

    }

}

