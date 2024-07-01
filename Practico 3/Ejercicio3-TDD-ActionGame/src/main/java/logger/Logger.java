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
    System.out.println("El Peleador es: " + fighter.getName() + " De tipo: " + fighter.get_FighterType());
    Weapon weapon = fighter.getWeapon();
    updateWeapon(weapon);
  }

  @Override
  public void updateWeapon(Weapon weapon) {
    System.out.println("Su arma es: " + weapon.getName() + " de tipo: " + weapon.get_TypeWeapon());
  }

  @Override
  public void updateFight(Entity fighter, Entity fighter2) {
    System.out.println("El peleador: " + fighter.getName() + " daño a " + fighter2.getName());
    System.out.println("El daño causado fue: " + fighter.getWeapon().get_damage());
  }
}
