package logger;

import characters.Entity;
import weapons.Weapon;

public interface Observer {
	public void updateFight(Entity fighter, Entity fighter2); 		//Actualizacion Pelea y daño que causo
	public void updateFighter(Entity fighter);	//Actualizacion Peleador
	public void updateWeapon(Weapon weapon);		//Actualizacion arma
	public void updateDeath (String msg);				//Actualizacion Muerte

}
