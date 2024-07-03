package weapon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import weapons.*;

public class FactoryTest {
    @Test
    public void factoryTest() {
        Weapon weapon = FactoryWeapons.createWeapon("sword");
        assertTrue(weapon instanceof Sword);
        weapon = FactoryWeapons.createWeapon("fireball");
        assertTrue(weapon instanceof FireBall);
        weapon = FactoryWeapons.createWeapon("arch");
        assertTrue(weapon instanceof Arch);
        weapon = FactoryWeapons.createWeapon("astralBall");
        assertTrue(weapon instanceof AstralBall);
        weapon = FactoryWeapons.createWeapon("fistBumps");
        assertTrue(weapon instanceof FistBumps);
        weapon = FactoryWeapons.createWeapon("cannonBomb");
        assertTrue(weapon instanceof CannonBomb);

    }

    @Test
    public void factoryGemTest() {
        Weapon weapon = FactoryWeapons.createWeapon("sword");
        assertTrue(weapon instanceof Sword);

        weapon = FactoryWeapons.addGem("ruby", weapon);
        assertTrue(weapon instanceof RubyGem);

        weapon = FactoryWeapons.addGem("saphire", weapon);
        assertTrue(weapon instanceof SaphireGem);

    }

    @Test
    public void errorFactoryWeapon() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactoryWeapons.createWeapon("lol");
        });

        assertEquals("name weapon invalid", exception.getMessage());
    }

    @Test
    public void errorFactoryGem() {
        Weapon weapon = FactoryWeapons.createWeapon("cannonBomb");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactoryWeapons.addGem("gemaDelInfinito", weapon);
        });

        assertEquals("name gem invalid", exception.getMessage());
    }
}
