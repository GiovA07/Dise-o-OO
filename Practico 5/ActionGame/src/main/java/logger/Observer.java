package logger;

import characters.Entity;

public interface Observer {
	public void updateDamage(Entity fighter, Entity fighter2); 		//Actualizacion Pelea y daño que causo
	public void updateFighter(Entity fighter);	//Actualizacion Peleador
	public void updateDeath (Entity fighter, Entity fighter2);				//Actualizacion Muerte

}
