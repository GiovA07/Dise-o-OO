package simulator;

import java.util.List;

import java.util.ArrayList;

public class DucksFlock {
  List<Duck> ducks = new ArrayList<>();

  public DucksFlock(List<Duck> ducks) {
    this.ducks = ducks;
  }

  public void fly() {
    for (Duck duck : ducks) {
      duck.performFly();
    }
  }

  public void quack() {
    for (Duck duck : ducks) {
      duck.performQuack();
    }
  }

}
