package characters;

import weapons.Arch;

public class Archer extends Entity {

  public Archer() {
    this.name = "Archer";
    this.health = 100;
    this.fighterType = FighterType.RANGED;
    this.setWeapon(new Arch());
  }

  @Override
  public void display() {
    System.out.println("Soy un arquero");

  }
}
