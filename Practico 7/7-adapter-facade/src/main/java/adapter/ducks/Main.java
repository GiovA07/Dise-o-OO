package adapter.ducks;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Duck> listDuck = new ArrayList<>();
        listDuck.add(new MallardDuck());
        listDuck.add(new DroneAdapter(new SuperDrone()));
        listDuck.add(new TurkeyAdapter(new WildTurkey()));
        listDuck.add(new MallardDuck());

        DucksFlock flock = new DucksFlock(listDuck);
        flock.fly();
        flock.quack();
    }
}
