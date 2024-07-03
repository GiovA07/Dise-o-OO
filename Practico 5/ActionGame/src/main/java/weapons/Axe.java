package weapons;

import characters.FighterType;

public class Axe extends Weapon{

  public Axe() {
    this.damage = 15;
    this.fighterType = FighterType.MELEE;
    this.maxGems = 4;
  }

  public String getName() {
    return "Axe";
  }
}
