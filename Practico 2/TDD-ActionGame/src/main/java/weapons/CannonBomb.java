package weapons;

import fightertype.FighterType;

public class CannonBomb extends Weapon {
  public CannonBomb() {
    this.damage = 70;
    this.fighterType = FighterType.RANGED;
  }
}
