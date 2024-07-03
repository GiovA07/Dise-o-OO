package weapons;

import characters.FighterType;

public class FistBumps extends Weapon {
  public FistBumps() {
    this.damage = 10;
    this.fighterType = FighterType.MELEE;
    this.maxGems = 6;
  }

  public String getName() {
    return "FistBumps";
  }

}
