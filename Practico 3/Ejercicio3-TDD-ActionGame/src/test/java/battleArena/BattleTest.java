package battleArena;

import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;
import logger.FileLogger;
import logger.Logger;

import org.junit.jupiter.api.Test;

import characters.*;
import characters.MagicFighter.Wizard;
import weapons.AstralBall;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BattleTest {

    @Test
    public void battleTest() {
        Entity entity = new Knight();
        Entity entity2 = new Wizard();
        BattleArena arena = new BattleArena(entity, entity2);
        FileLogger log = new FileLogger();
        arena.registerObserver(log);
        arena.battle();
    }

    @Test
    public void battleTestFightWizardAstralBall() {
        Entity character1 = new Archer();
        Entity character2 = new Wizard();
        character2.setWeapon(new AstralBall());
        BattleArena arena = new BattleArena(character1, character2);
        Logger log = new Logger();
        arena.registerObserver(log);
        arena.battle();
    }

}
