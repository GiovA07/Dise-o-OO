package weapons;

import characters.FighterType;

public class DarkMagic extends Weapon{
    public DarkMagic() {
        this.damage = 15;
        this.fighterType = FighterType.MAGIC;
    }

    public String getName() {
        return "DarkMagic";
    }
}
