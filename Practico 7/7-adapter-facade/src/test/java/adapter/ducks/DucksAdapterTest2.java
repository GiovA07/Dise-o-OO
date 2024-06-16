package adapter.ducks;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;
import org.junit.jupiter.api.Test;

public class DucksAdapterTest2 {

    @Test
    public void testDucksFlockFly() {
        List<Duck> ducks = new ArrayList<>();
        MockDuck duck = new MockDuck();
        MockDuck duck2 = new MockDuck();
        MockDuck duck3 = new MockDuck();
        MockDuck duck4 = new MockDuck();
        ducks.add(duck);
        ducks.add(duck2);
        ducks.add(duck3);
        ducks.add(duck4);
        DucksFlock flock = new DucksFlock(ducks);

        flock.fly();

        assertTrue(duck.isFlyCalled());
        assertTrue(duck2.isFlyCalled());
        assertTrue(duck3.isFlyCalled());
        assertTrue(duck4.isFlyCalled());
    }

    @Test
    public void testDucksFlockQuack() {
        List<Duck> ducks = new ArrayList<>();
        MockDuck duck = new MockDuck();
        MockDuck duck2 = new MockDuck();
        MockDuck duck3 = new MockDuck();
        MockDuck duck4 = new MockDuck();
        ducks.add(duck);
        ducks.add(duck2);
        ducks.add(duck3);
        ducks.add(duck4);
        DucksFlock flock = new DucksFlock(ducks);

        flock.quack();

        assertTrue(duck.isQuackCalled());
        assertTrue(duck2.isQuackCalled());
        assertTrue(duck3.isQuackCalled());
        assertTrue(duck4.isQuackCalled());
    }

    @Test
    public void testDuckFlockAdapter() {
        List<Duck> ducks = new ArrayList<>();
        MallardDuck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        Drone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);

        ducks.add(droneAdapter);
        ducks.add(turkeyAdapter);
        ducks.add(duck);

        DucksFlock flock = new DucksFlock(ducks);

        flock.fly();
    }

    @Test
    public void testDuckFlockAdapter2() {
        List<Duck> ducks = new ArrayList<>();
        MockDuck duck = new MockDuck();
        MockTurkey turkey = new MockTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        MockDrone drone = new MockDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);

        ducks.add(droneAdapter);
        ducks.add(turkeyAdapter);
        ducks.add(duck);

        DucksFlock flock = new DucksFlock(ducks);

        flock.fly();

        assertTrue(duck.isFlyCalled());
        assertTrue(turkey.isFlyCalled());
        assertTrue(drone.isSpinRotorsCalled());
    }

    @Test
    public void testDuckFlockAdapter3() {
        List<Duck> ducks = new ArrayList<>();
        MockDuck duck = new MockDuck();
        MockTurkey turkey = new MockTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        MockDrone drone = new MockDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);

        ducks.add(droneAdapter);
        ducks.add(turkeyAdapter);
        ducks.add(duck);

        DucksFlock flock = new DucksFlock(ducks);

        flock.quack();

        assertTrue(duck.isQuackCalled());
        assertTrue(turkey.isGobbleCalled());
        assertTrue(drone.isBeepCalled());
    }

}
