package battleArena;

import characters.Entity;
import logger.Subject;

public class BattleArena extends Subject {

  public void battle(Entity fighter1, Entity fighter2)  {
    this.notifyFighterObservers(fighter1);
    this.notifyFighterObservers(fighter2);
    int turn = 1;
    while(!terminedBattle(fighter1, fighter2)) {
      if (turn == 1) {
        fighter1.attack(fighter2);
        this.notifyDamageObservers(fighter1, fighter2);
        turn = 2;
      } else {
        fighter2.attack(fighter1);
        this.notifyDamageObservers(fighter2, fighter1);
        turn = 1;
      }
    }
    this.notifyDeadObservers(fighter1, fighter2);
  }

  private boolean terminedBattle(Entity entityOne, Entity entityTwo) {
    return !entityOne.isAlive() || !entityTwo.isAlive();
  }
}
