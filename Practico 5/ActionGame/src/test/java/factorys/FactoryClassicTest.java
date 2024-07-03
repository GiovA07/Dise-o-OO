package factorys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import characters.Archer;
import characters.Entity;
import characters.Knight;
import characters.Wizard;
import weapons.*;

public class FactoryClassicTest {
    InterfazFactoryVersion factory = new FactoryClassic();

    @Test
    public void factoryClassicTest() {
        Entity character = factory.createCharacter("wizard");
        assertTrue(character instanceof Wizard);
        character = factory.createCharacter("knight");
        assertTrue(character instanceof Knight);
        character = factory.createCharacter("archer");
        assertTrue(character instanceof Archer);
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
        Weapon weapon = factory.createWeapon("sword");
        assertTrue(weapon instanceof Sword);
        weapon = factory.createWeapon("fireball");
        assertTrue(weapon instanceof FireBall);
        weapon = factory.createWeapon("arch");
        assertTrue(weapon instanceof Arch);
        weapon = factory.createWeapon("astralBall");
        assertTrue(weapon instanceof AstralBall);
        weapon = factory.createWeapon("fistBumps");
        assertTrue(weapon instanceof FistBumps);
        weapon = factory.createWeapon("cannonBomb");
        assertTrue(weapon instanceof CannonBomb);

    }

    @Test
    public void factoryGemTest() {
        Weapon weapon = factory.createWeapon("sword");
        assertTrue(weapon instanceof Sword);

        weapon = factory.addGem("ruby", weapon);
        assertTrue(weapon instanceof RubyGem);

        weapon = factory.addGem("saphire", weapon);
        assertTrue(weapon instanceof SaphireGem);

        assertTrue(weapon.cantGems() == 2);
        assertTrue(weapon.get_damage() == 15+5+7);

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
