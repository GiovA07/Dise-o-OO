package bowling;

public class Frame {
  int roll1 = -1;
  int roll2 = -1;

  public void addRoll(int roll) {
    if (roll1 == -1)
      roll1 = roll;
    else
      roll2 = roll;

  }

  public int getRoll1() {
    return roll1;
  }

  public int getRoll2() {
    return roll2;
  }

  public boolean isStrike() {
    return roll1 == 10;
  }

  public boolean isParce() {
    return roll1 + roll2 == 10;
  }

  public int getScoreFrame() {
    if(!isCompleted() && roll1 != -1)
      return roll1;

    if(!isCompleted())
      return 0;

    return roll1 + roll2;
  }

  public boolean isCompleted() {
    return roll1 != -1 && roll2 != -1;
  }


}
