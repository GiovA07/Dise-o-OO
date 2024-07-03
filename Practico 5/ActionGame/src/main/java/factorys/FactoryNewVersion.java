package factorys;

import weapons.*;
import characters.*;

public class FactoryNewVersion implements InterfazFactoryVersion {
    public Entity createCharacter(String type) {
        if (type.equals("knight")) {
            return new Knight();
        } else if (type.equals("archer")) {
            return new Archer();
        } else if (type.equals("wizard")) {
            return new Wizard();
        } else if (type.equals("necromancer")) {
            return new Necromancer();
        } else if (type.equals("sniper")) {
            return new Sniper();
        } else if (type.equals("barbarian")) {
            return new Barbarian();
        } else {
            throw new IllegalArgumentException();
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
        } else if (type.equals("axe")) {
            return new Axe();
        } else if (type.equals("darkMagic")) {
            return new DarkMagic();
        } else if (type.equals("rifle")) {
            return new Rifle();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Weapon addGem(String type, Weapon weapon) {
        if (type.equals("ruby")) {
            return new RubyGem(weapon);
        } else if (type.equals("saphire")) {
            return new SaphireGem(weapon);
        } else if (type.equals("amethyst")) {
            return new AmethystGem(weapon);
        } else if (type.equals("pearl")) {
            return new PearlGem(weapon);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
