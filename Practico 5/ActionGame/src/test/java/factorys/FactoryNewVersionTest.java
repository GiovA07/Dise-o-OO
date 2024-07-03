package factorys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import characters.*;
import weapons.*;

public class FactoryNewVersionTest {
        InterfazFactoryVersion factory = new FactoryNewVersion();

    @Test
    public void factoryClassicTest() {
        Entity character = factory.createCharacter("necromancer");
        assertTrue(character instanceof Necromancer);
        character = factory.createCharacter("barbarian");
        assertTrue(character instanceof Barbarian);
        character = factory.createCharacter("sniper");
        assertTrue(character instanceof Sniper);
    }

    @Test
    public void errorFactoryCharacter() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createCharacter("lol");
        });

        assertEquals("name character invalid", exception.getMessage());
    }

    @Test
    public void factoryTest() {
        Weapon weapon = factory.createWeapon("axe");
        assertTrue(weapon instanceof Axe);
        weapon = factory.createWeapon("darkMagic");
        assertTrue(weapon instanceof DarkMagic);
        weapon = factory.createWeapon("rifle");
        assertTrue(weapon instanceof Rifle);
    }

    @Test
    public void factoryGemTest() {
        Weapon weapon = factory.createWeapon("axe");
        assertTrue(weapon instanceof Axe);

        weapon = factory.addGem("amethyst", weapon);
        assertTrue(weapon instanceof AmethystGem);

        weapon = factory.addGem("pearl", weapon);
        assertTrue(weapon instanceof PearlGem);


        assertTrue(weapon.cantGems() == 2);
        assertTrue(weapon.get_damage() == 15+10+6);


    }

    @Test
    public void errorFactoryWeapon() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createWeapon("lol");
        });

        assertEquals("name weapon invalid", exception.getMessage());
    }

    @Test
    public void errorFactoryGem() {
        Weapon weapon = factory.createWeapon("cannonBomb");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.addGem("gemaDelInfinito", weapon);
        });

        assertEquals("name gem invalid", exception.getMessage());
    }
}
