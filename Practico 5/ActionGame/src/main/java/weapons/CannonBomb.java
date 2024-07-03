package weapons;

import characters.FighterType;

public class CannonBomb extends Weapon {
  public CannonBomb() {
    this.damage = 15;
    this.fighterType = FighterType.RANGED;
  }

  public String getName() {
    return "CannonBomb";
  }
}
