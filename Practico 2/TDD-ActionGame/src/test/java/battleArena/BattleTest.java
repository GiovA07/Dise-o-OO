package battleArena;

import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;

import org.junit.jupiter.api.Test;

import characters.*;
import characters.MagicFighter.Wizard;
import weapons.AstralBall;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BattleTest {

    @Test
    public void battleTest() {
        Entity character1 = new Knight();
        Entity character2 = new Wizard();
        BattleArena arena = new BattleArena();
        String win = arena.battle(character1, character2);
        assertEquals("Player 1 Win", win);
        assertTrue(character1.getHealth() > 0);
        assertTrue(character2.getHealth() == 0);
    }

    @Test
    public void battleTestFightWizardAstralBall() {
        Entity character1 = new Archer();
        Entity character2 = new Wizard();
        character2.setWeapon(new AstralBall());
        BattleArena arena = new BattleArena();
        String win = arena.battle(character1, character2);
        assertEquals("Player 1 Win", win);
        assertTrue(character2.getHealth() == 0);
        assertTrue(character1.getHealth() > 0);

    }

}
