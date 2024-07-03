package weapons;


public class FactoryWeapons {
    public static Weapon createWeapon(String type) {
        if(type.equals("sword")) {
            return new Sword();
        } else if (type.equals("fireball")) {
            return new FireBall();
        } else if (type.equals("fistBumps")) {
            return new FistBumps();
        } else if (type.equals("arch")) {
            return new Arch();
        } else if (type.equals("astralBall")) {
            return new AstralBall();
        } else if (type.equals("cannonBomb")) {
            return new CannonBomb();
        } else {
            throw new IllegalArgumentException("name weapon invalid");
        }
    }

    public static Weapon addGem(String type, Weapon weapon) {
        if(type.equals("ruby")) {
            return new RubyGem(weapon);
        } else if (type.equals("saphire")) {
            return new SaphireGem(weapon);
        } else {
            throw new IllegalArgumentException("name gem invalid");
        }
    }
}
