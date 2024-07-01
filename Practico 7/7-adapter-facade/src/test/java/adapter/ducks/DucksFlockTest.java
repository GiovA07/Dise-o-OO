package adapter.ducks;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DucksFlockTest {

    private MockDuck duck1;
    private MockDuck duck2;
    private MockDuck duck3;
    private DucksFlock flock;

    @BeforeEach
    public void setUp() {
        duck1 = new MockDuck();
        duck2 = new MockDuck();
        duck3 = new MockDuck();
        List<Duck> ducks = Arrays.asList(duck1, duck2, duck3);
        flock = new DucksFlock(ducks);
    }

    @Test
    public void testFly() {
        flock.fly();
        assertTrue(duck1.isFlyCalled());
        assertTrue(duck2.isFlyCalled());
        assertTrue(duck3.isFlyCalled());
    }

    @Test
    public void testQuack() {
        flock.quack();
        assertTrue(duck1.isQuackCalled());
        assertTrue(duck2.isQuackCalled());
        assertTrue(duck3.isQuackCalled());
    }
}
