package logger;

import characters.Entity;
import weapons.Weapon;

public class Logger implements Observer {
  @Override
  public void updateDeath(String msg) {
    System.out.println(msg);
  }

  @Override
  public void updateFight(Entity fighter, Entity fighter2) {
    System.out.println("El peleador: " + fighter.getName() + "Daño a " + fighter2.getName());
    System.out.println("El daño causado fue: " + fighter.getWeapon().get_damage());
  }

  @Override
  public void updateFighter(Entity fighter) {
    System.out.println("El Peleador es: " + fighter.getName());
    System.out.println("Su tipo es: " + fighter.get_FighterType());
  }

  @Override
  public void updateWeapon(Weapon weapon) {
    System.out.println("El Tipo de Arma es: " + weapon.get_TypeWeapon());
  }
}
