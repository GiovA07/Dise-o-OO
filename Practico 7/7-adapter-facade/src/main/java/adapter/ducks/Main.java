package adapter.ducks;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        Turkey turkey = new WildTurkey();
        List<Duck> listDuck = new ArrayList<>();
        listDuck.add(new MallardDuck());
        listDuck.add(new DroneAdapter(drone));
        listDuck.add(new TurkeyAdapter(turkey));
        listDuck.add(new MallardDuck());

        DucksFlock flock = new DucksFlock(listDuck);
        flock.fly();
        flock.quack();
    }
}
