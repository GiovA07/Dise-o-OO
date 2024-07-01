package weapons;

import fightertype.FighterType;

public class Arch extends Weapon{
    public Arch() {
      this.damage = 5;
      this.fighterType = FighterType.RANGED;
    }

    @Override
    public String getName() {
        return "Arch";
    }
}
