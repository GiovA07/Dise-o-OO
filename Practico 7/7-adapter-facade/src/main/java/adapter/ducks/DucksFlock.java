package adapter.ducks;

import java.util.List;

import java.util.ArrayList;

public class DucksFlock implements Duck {
  List<Duck> ducks = new ArrayList<>();

  public DucksFlock(List<Duck> ducks) {
    this.ducks = ducks;
  }

  public void fly() {
    for (Duck duck : ducks) {
      duck.fly();
    }
  }

  public void quack() {
    for (Duck duck : ducks) {
      duck.quack();
    }
  }

}
