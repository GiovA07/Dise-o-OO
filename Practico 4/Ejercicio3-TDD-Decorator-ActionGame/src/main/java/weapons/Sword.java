package weapons;

import fightertype.FighterType;

public class Sword extends Weapon{

  public Sword() {
    this.damage = 70;
    this.fighterType = FighterType.MELEE;
    this.maxGems = 4;
  }

}
