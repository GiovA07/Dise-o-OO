package battleArena;

import characters.Entity;
import logger.Subject;

public class BattleArena extends Subject {
  Entity fighter1;
  Entity fighter2;

  public BattleArena(Entity fighter1, Entity fighter2) {
    this.fighter1 = fighter1;
    this.fighter2 = fighter2;
  }


  public void battle()  {

    this.notifyFighterObservers(fighter1);
    this.notifyFighterObservers(fighter2);


    int turn = 1;
    while(!terminedBattle(fighter1, fighter2)) {
      if (turn == 1) {
        fighter1.attack(fighter2);
        this.notifyFightObservers(fighter1, fighter2);
        turn = 2;
      } else {
        fighter2.attack(fighter1);
        this.notifyFightObservers(fighter2, fighter1);
        turn = 1;
      }
    }
    this.notifyDeadObservers(fighter1, fighter2);
  }

  private boolean terminedBattle(Entity fighter1, Entity fighter2) {
    return fighter1.getHealth() == 0 || fighter2.getHealth() == 0;
  }
}
