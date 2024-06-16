package adapter.ducks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
public class DucksAdapterTest {
  @Test
  public void ducksAdapterFlyTest() {
    List<Duck> list = new ArrayList<>();

    MockDuck mallardDuck = new MockDuck();
    list.add(mallardDuck);

    MockDrone drone = new MockDrone();
    Duck droneAdapter = new DroneAdapter(drone);
    list.add(droneAdapter);

    MockTurkey turkey = new MockTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    list.add(turkeyAdapter);


    DucksFlock flock = new DucksFlock(list);
    flock.fly();

    assertTrue(mallardDuck.isFlyCalled());
    assertTrue(drone.isSpinRotorsCalled());
    assertTrue(turkey.isFlyCalled());
  }
}
