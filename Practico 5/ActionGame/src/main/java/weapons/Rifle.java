package weapons;

import characters.FighterType;

public class Rifle extends Weapon {
  public Rifle() {
    this.damage = 15;
    this.fighterType = FighterType.RANGED;
    this.maxGems = 5;
  }

  public String getName() {
    return "Rifle";
  }
}
