package weapons;

import fightertype.FighterType;

public abstract class Weapon {
  int damage;
  FighterType fighterType;

  public int get_damage() {
    return this.damage;
  }

  public FighterType get_TypeWeapon() {
    return this.fighterType;
  }


}
