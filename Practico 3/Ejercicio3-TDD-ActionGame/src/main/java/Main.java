import battleArena.BattleArena;
import characters.Entity;
import characters.MagicFighter.Wizard;
import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;
import logger.Logger;
import logger.StadisticsLogger;
import weapons.CannonBomb;

public class Main {
    public static void main(String[] args) {
        Entity character1 = new Knight();
        Entity character2 = new Archer();
        character2.setWeapon(new CannonBomb());

        BattleArena arena = new BattleArena();
        arena.registerObserver(new Logger());
        arena.registerObserver(new StadisticsLogger());
        arena.battle(character1, character2);

        character1 = new Wizard();
        character2 = new Archer();
        character2.setWeapon(new CannonBomb());

        arena.battle(character1, character2);
    }
}
