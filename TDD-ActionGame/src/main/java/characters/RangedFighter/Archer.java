package characters.RangedFighter;

import characters.Entity;
import fightertype.FighterType;
import weapons.Arch;

public class Archer extends Entity {

  public Archer() {
    this.name = "Archer";
    this.health = 100;
    this.fighterType = FighterType.RANGED;
    this.setWeapon(new Arch());
  }

  @Override
  protected void display() {
    // TODO Auto-generated method stub

  }
}
