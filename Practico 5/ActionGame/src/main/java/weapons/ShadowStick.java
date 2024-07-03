package weapons;

import characters.FighterType;

public class ShadowStick extends Weapon{
    public ShadowStick() {
        this.damage = 15;
        this.fighterType = FighterType.MAGIC;
    }

    public String getName() {
        return "ShadowStick";
    }
}
