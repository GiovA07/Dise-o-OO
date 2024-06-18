package weapons;

import fightertype.FighterType;

public class FistBumps extends Weapon {
  public FistBumps() {
    this.damage = 15;
    this.fighterType = FighterType.MELEE;
    this.maxGems = 6;
  }

}
