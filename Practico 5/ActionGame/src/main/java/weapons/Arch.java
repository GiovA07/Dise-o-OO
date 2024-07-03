package weapons;

import characters.FighterType;

public class Arch extends Weapon{
    public Arch() {
      this.damage = 10;
      this.fighterType = FighterType.RANGED;
    }

    public String getName() {
      return "Arch";
    }
}
