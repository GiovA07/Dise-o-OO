package battleArena;

import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;
import logger.FileLogger;
import logger.Logger;
import logger.Observer;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import characters.*;
import characters.MagicFighter.Wizard;
import weapons.AstralBall;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTest {

    @Test
    public void battleTest() {
        Entity entity = new Knight();
        Entity entity2 = new Wizard();
        BattleArena arena = new BattleArena(entity, entity2);
        Observer log = mock(FileLogger.class);
        arena.registerObserver(log);
        arena.battle();


        verify(log).updateFighter(entity);
        verify(log).updateFighter(entity2);

        verify(log, times(2)).updateFight(entity, entity2);
        verify(log, times(1)).updateFight(entity2, entity);

        verify(log).updateDeath(entity, entity2);
    }

    @Test
    public void battleTestFightWizardAstralBall() {
        Entity character1 = new Wizard();
        Entity character2 = new Archer();

        character1.setWeapon(new AstralBall());
        BattleArena arena = new BattleArena(character1, character2);
        Observer log = mock(Logger.class);
        arena.registerObserver(log);
        arena.battle();


        verify(log).updateFighter(character1);
        verify(log).updateFighter(character2);

        verify(log, times(2)).updateFight(character1, character2);
        verify(log, times(1)).updateFight(character2, character1);

        verify(log).updateDeath(character1, character2);
    }

}
