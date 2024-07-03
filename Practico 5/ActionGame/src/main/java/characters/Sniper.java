package characters;

import weapons.Arch;

public class Sniper extends Entity {
    public Sniper() {
        this.name = "Sniper";
        this.health = 100;
        this.fighterType = FighterType.RANGED;
        this.setWeapon(new Arch());
    }

    @Override
    public void display() {
      System.out.println("Soy un sniper");

    }
}
