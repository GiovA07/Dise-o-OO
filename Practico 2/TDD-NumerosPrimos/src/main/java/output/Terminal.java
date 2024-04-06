package output;

import java.util.List;

public class Terminal implements InterfazOutput{
  @Override
  public void print(List<Integer> toPrint) {
    System.out.println("Prime Numers: " + toPrint);
  }
}
