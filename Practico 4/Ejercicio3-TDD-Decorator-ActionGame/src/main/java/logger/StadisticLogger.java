package logger;

import characters.Entity;
import weapons.Weapon;

public class StadisticLogger implements Observer{
    @Override
    public void updateDeath(String msg) {
      writeFile(msg);
    }

    @Override
    public void updateFight(Entity fighter, Entity fighter2) {
      writeFile("El peleador: " + fighter.getName() + "Daño a " + fighter2.getName());
      writeFile("El daño causado fue: " + fighter.getWeapon().get_damage());
    }

    @Override
    public void updateFighter(Entity fighter) {
      writeFile("El Peleador es: " + fighter.getName());
      writeFile("Su tipo es: " + fighter.get_FighterType());
    }

    @Override
    public void updateWeapon(Weapon weapon) {
      writeFile("El Tipo de Arma es: " + weapon.get_TypeWeapon());
    }
}
