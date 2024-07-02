package battleArena;

import characters.Entity;

public class BattleArena {

  public String battle(Entity character1, Entity character2) {

    int turn = 1;
    while (!terminedBattle(character1, character2)) {
      if (turn == 1) {
        character1.attack(character2);
        turn = 2;
      } else {
        character2.attack(character1);
        turn = 1;
      }
    }
    return battleWin(character1, character2);
  }

  private boolean terminedBattle(Entity entityOne, Entity entityTwo) {
    return entityOne.getHealth() == 0 || entityTwo.getHealth() == 0;
  }

  private String battleWin(Entity entityOne, Entity entityTwo) {
    if (entityOne.getHealth() == 0)
      return "Player 2 Win";
    else
      return "Player 1 Win";
  }
}
