package weapons;

import fightertype.FighterType;

public class Sword extends Weapon{

  public Sword() {
    this.damage = 10;
    this.fighterType = FighterType.MELEE;
  }

  @Override
  public String getName() {
      return "Sword";
  }
}
