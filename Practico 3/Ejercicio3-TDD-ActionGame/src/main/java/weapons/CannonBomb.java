package weapons;

import fightertype.FighterType;

public class CannonBomb extends Weapon {
  public CannonBomb() {
    this.damage = 10;
    this.fighterType = FighterType.RANGED;
  }

  @Override
  public String getName() {
      return "CannonBomb";
  }
}
