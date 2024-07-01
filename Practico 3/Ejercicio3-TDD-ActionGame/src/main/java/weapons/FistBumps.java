package weapons;

import fightertype.FighterType;

public class FistBumps extends Weapon {
  public FistBumps() {
    this.damage = 5;
    this.fighterType = FighterType.MELEE;
  }

  @Override
  public String getName() {
      return "FirstBumps";
  }

}
