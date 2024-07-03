package characters;

import weapons.FireBall;

public class Necromancer extends Entity{
  public Necromancer() {
    this.name = "Necromancer";
    this.health = 100;
    this.fighterType = FighterType.MAGIC;
    this.setWeapon(new FireBall());
  }

  @Override
  public void display() {
    System.out.println("Soy un necromancer");

  }
}
