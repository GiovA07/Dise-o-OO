package characters;

import weapons.FireBall;

public class Wizard extends Entity{
  public Wizard() {
    this.name = "Wizard";
    this.health = 100;
    this.fighterType = FighterType.MAGIC;
    this.setWeapon(new FireBall());
  }

  @Override
  public void display() {
    System.out.println("Soy un Mago");

  }
}
