package factorys;

import characters.Entity;
import weapons.Weapon;

public interface InterfazFactoryVersion {
    public Entity createCharacter(String type);
    public Weapon createWeapon(String type);
    public Weapon addGem(String type, Weapon weapon);
}
