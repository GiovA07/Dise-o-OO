package simulator;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import simulator.fly.*;
import simulator.quack.*;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.ArrayList;

public class DuckFlockTest {

    @Test
    public void duckFlockFlyTest() {

        List<Duck> listDuck = new ArrayList<>();
        Duck duck1 = mock(RubberDuck.class);
        Duck duck2 = mock(MallardDuck.class);
        Duck duck3 = mock(WoodenDuck.class);
        Duck duck4 = mock(ModelDuck.class);

        listDuck.add(duck1);
        listDuck.add(duck2);
        listDuck.add(duck3);
        listDuck.add(duck4);

        DucksFlock flock = new DucksFlock(listDuck);

        flock.fly();

        verify(duck1).performFly();
        verify(duck2).performFly();
        verify(duck3).performFly();
        verify(duck4).performFly();
    }

    @Test
    public void duckQuackFlyTest() {

        List<Duck> listDuck = new ArrayList<>();
        Duck duck1 = mock(RubberDuck.class);
        Duck duck2 = mock(MallardDuck.class);
        Duck duck3 = mock(WoodenDuck.class);
        Duck duck4 = mock(ModelDuck.class);

        listDuck.add(duck1);
        listDuck.add(duck2);
        listDuck.add(duck3);
        listDuck.add(duck4);

        DucksFlock flock = new DucksFlock(listDuck);

        flock.quack();

        verify(duck1).performQuack();
        verify(duck2).performQuack();
        verify(duck3).performQuack();
        verify(duck4).performQuack();
    }

}
