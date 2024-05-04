package logger;
import java.util.ArrayList;
import java.util.List;

import characters.Entity;
import weapons.Weapon;

public abstract class Subject {
	List<Observer> observers;

	public Subject () {
		observers = new ArrayList<Observer>();
	}

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

	public void notifyFighterObservers(Entity fighter) {
    for (Observer observer : observers) {
			observer.updateFighter(fighter);
		}
  }

	public void notifyWeaponsObservers(Weapon weapon) {
    for (Observer observer : observers) {
			observer.updateWeapon(weapon);
		}
  }

  public void notifyDamageObservers(Entity fighter, Entity fighter2) {
    for (Observer observer : observers) {
			observer.updateDamage(fighter,fighter2);
		}
  }

	public void notifyDeadObservers(String str) {
    for (Observer observer : observers) {
			observer.updateDeath(str);
		}
  }

}
