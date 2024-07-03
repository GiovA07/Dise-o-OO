package factorys;

import weapons.*;
import characters.*;

public class FactoryClassic implements InterfazFactoryVersion {
    public Entity createCharacter(String type) {
        if (type.equals("knight")) {
            return new Knight();
        } else if (type.equals("archer")) {
            return new Archer();
        } else if (type.equals("wizard")) {
            return new Wizard();
        } else {
            throw new IllegalArgumentException("name character invalid");
        }
    }

    public Weapon createWeapon(String type) {
        if (type.equals("sword")) {
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

    public Weapon addGem(String type, Weapon weapon) {
        if (type.equals("ruby")) {
            return new RubyGem(weapon);
        } else if (type.equals("saphire")) {
            return new SaphireGem(weapon);
        } else {
            throw new IllegalArgumentException("name gem invalid");
        }
    }
}
