package characters;

import characters.MagicFighter.Wizard;
import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;
import fightertype.FighterType;

import org.junit.jupiter.api.Test;

import weapons.Arch;
import weapons.AstralBall;
import weapons.CannonBomb;
import weapons.FireBall;
import weapons.FistBumps;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTest {

    @Test
    public void knightTest() {
        Entity entity = new Knight();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof FistBumps);
        assertTrue(entity.getName() == "Knight");
        assertEquals(FighterType.MELEE, entity.fighterType);
    }

    @Test
    public void wizardTest() {
        Entity entity = new Wizard();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof FireBall);
        assertTrue(entity.getName() == "Wizard");
        assertEquals(FighterType.MAGIC, entity.fighterType);
    }

    @Test
    public void ArcherTest() {
        Entity entity = new Archer();
        assertEquals(100, entity.getHealth());
        assertTrue(entity.getWeapon() instanceof Arch);
        assertTrue(entity.getName() == "Archer");
        assertEquals(FighterType.RANGED, entity.fighterType);
    }

    @Test
    public void modifyWeaponWizard() {
        Entity entity = new Wizard();
        entity.setWeapon(new AstralBall());
        Weapon weapon = entity.getWeapon();
        assertTrue(weapon instanceof AstralBall);
        assertTrue(weapon.get_TypeWeapon() == FighterType.MAGIC);
    }

    @Test
    public void modifyWeaponKnife() {
        Entity entity = new Knight();
        entity.setWeapon(new Sword());
        Weapon weapon = entity.getWeapon();
        assertTrue(weapon instanceof Sword);
        assertTrue(weapon.get_TypeWeapon() == FighterType.MELEE);
    }

    @Test
    public void modifyWeaponArch() {
        Entity entity = new Archer();
        entity.setWeapon(new CannonBomb());
        Weapon weapon = entity.getWeapon();
        assertTrue(weapon instanceof CannonBomb);
        assertTrue(weapon.get_TypeWeapon() == FighterType.RANGED);
    }

    @Test
    public void modifyWeaponException() {
        Entity entity = new Knight();

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            entity.setWeapon(new Arch());
        });
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage,"The weapon does not belong to the character's type.");
    }


    @Test
    public void attackTest() {
        Entity character1 = new Archer();
        Entity character2 = new Wizard();
        int health = character2.getHealth();
        character1.attack(character2);
        assertTrue(character2.getHealth() < health);
    }
}

