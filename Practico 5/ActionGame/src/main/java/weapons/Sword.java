package weapons;

import characters.FighterType;

public class Sword extends Weapon{

  public Sword() {
    this.damage = 15;
    this.fighterType = FighterType.MELEE;
    this.maxGems = 4;
  }

  public String getName() {
    return "Sword";
  }

}
