package logger;

import characters.Entity;
import weapons.Weapon;

public class Logger implements Observer {
  @Override
  public void updateDeath(Entity fighter, Entity fighter2) {
    String msg = "";
    if (fighter.getHealth() == 0) {
      msg = "Player 1 MURIO. PLAYER 2 GANA!";
    } else {
      msg = "Player 2 MURIO. PLAYER 1 GANA!";
    }
    System.out.println(msg);
  }

  @Override
  public void updateFighter(Entity fighter) {
    Weapon weapon = fighter.getWeapon();
    String msg =  "El Peleador es: " + fighter.getName() +
                  " De tipo: " + fighter.get_FighterType() +
                  "con arma: " + weapon.getName();

    System.out.println(msg);

  }

  @Override
  public void updateDamage(Entity fighter, Entity fighter2) {
    Weapon weapon = fighter.getWeapon();
    System.out.println("El peleador: " + fighter.getName() + " daño a " + fighter2.getName());
    System.out.println("El daño causado fue: " + weapon.get_damage());
  }
}
