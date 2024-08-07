package battleArena;

import logger.FileLogger;
import logger.Logger;

import org.junit.jupiter.api.Test;

import characters.*;
import weapons.AstralBall;

public class BattleTest {

    @Test
    public void battleTest() {
        Entity entity = new Knight();
        Entity entity2 = new Wizard();
        BattleArena arena = new BattleArena();
        FileLogger log = new FileLogger();
        arena.registerObserver(log);
        arena.battle(entity, entity2);
    }

    @Test
    public void battleTestFightWizardAstralBall() {
        Entity character1 = new Archer();
        Entity character2 = new Wizard();
        character2.setWeapon(new AstralBall());
        BattleArena arena = new BattleArena();
        Logger log = new Logger();
        arena.registerObserver(log);
        arena.battle(character1, character2);
    }

}
