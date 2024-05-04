package weapons;

import fightertype.FighterType;

public abstract class Weapon {
  static int maxGems = 3;
  int damage;
  FighterType fighterType;

  public int get_damage() {
    return this.damage;
  }

  public FighterType get_TypeWeapon() {
    return this.fighterType;
  }

  public int cantGems() {
    return 0;
	}


}
