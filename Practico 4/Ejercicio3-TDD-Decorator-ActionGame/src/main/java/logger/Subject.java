package logger;
import java.util.ArrayList;
import java.util.List;

import characters.Entity;

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

  public void notifyDamageObservers(Entity fighter, Entity fighter2) {
    for (Observer observer : observers) {
			observer.updateDamage(fighter,fighter2);
		}
  }

	public void notifyDeadObservers(Entity fighter, Entity fighter2) {
    for (Observer observer : observers) {
			observer.updateDeath(fighter, fighter2);
		}
  }

}
