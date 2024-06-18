package characters.MagicFighter;

import fightertype.FighterType;
import weapons.FireBall;
import characters.Entity;

public class Wizard extends Entity{
  public Wizard() {
    this.name = "Wizard";
    this.health = 100;
    this.fighterType = FighterType.MAGIC;
    this.setWeapon(new FireBall());
  }

  @Override
  protected void display() {
    System.err.println("i am wizard");

  }
}
