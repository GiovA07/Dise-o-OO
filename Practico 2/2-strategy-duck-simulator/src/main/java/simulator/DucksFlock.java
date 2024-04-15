package simulator;

import java.util.List;

import java.util.ArrayList;

public class DucksFlock extends Duck {
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

  @Override
  void display() {
    System.err.println("We are ducks flock");
  }

}
