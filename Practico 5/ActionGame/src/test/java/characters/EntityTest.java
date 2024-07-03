package characters;

import org.junit.jupiter.api.Test;

import weapons.Arch;
import weapons.AstralBall;
import weapons.FireBall;
import weapons.FistBumps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTest {

    private Entity createKnight() {
        return new Knight();
    }

    private Entity createWizard() {
        return new Wizard();
    }

    private Entity createArcher() {
        return new Archer();
    }

    @Test
    public void knightTest() {
        Entity entity = createKnight();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof FistBumps);
        assertTrue(entity.getName() == "Knight");
        assertEquals(FighterType.MELEE, entity.get_FighterType());
    }

    @Test
    public void wizardTest() {
        Entity entity = createWizard();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof FireBall);
        assertTrue(entity.getName() == "Wizard");
        assertEquals(FighterType.MAGIC, entity.get_FighterType());
    }

    @Test
    public void ArcherTest() {
        Entity entity = createArcher();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof Arch);
        assertTrue(entity.getName() == "Archer");
        assertEquals(FighterType.RANGED, entity.get_FighterType());
    }

    @Test
    public void modifyWeapon() {
        Entity entity = createWizard();
        entity.setWeapon(new AstralBall());
        assertTrue(entity.getWeapon() instanceof AstralBall);
    }


    @Test
    public void attackTest() {
        Entity character1 = createArcher();
        Entity character2 = createWizard();
        int health = character2.getHealth();
        character1.attack(character2);
        assertTrue(character2.getHealth() < health);
    }
}

