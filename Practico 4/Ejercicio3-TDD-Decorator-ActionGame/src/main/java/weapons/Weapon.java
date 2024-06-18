package weapons;

import fightertype.FighterType;

public abstract class Weapon {
  int maxGems = 3;
  int damage;
  FighterType fighterType;

  public int get_damage() {
    return this.damage;
  }

  public int get_maxGems() {
    return this.maxGems;
  }

  public FighterType get_TypeWeapon() {
    return this.fighterType;
  }

  public int cantGems() {
    return 0;
	}


}
