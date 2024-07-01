package logger;

import characters.Entity;
import weapons.Weapon;

import java.util.HashMap;
import java.util.Map;

public class StadisticsLogger implements Observer {
    private Map<String, Integer> victoryStats = new HashMap<>();

    @Override
    public void updateDeath(Entity fighter, Entity fighter2) {
        Entity winner = entityWinner(fighter, fighter2);
        Weapon weaponWinner = winner.getWeapon();
        String key = winner.getName() + " con " + weaponWinner.getName();
        victoryStats.put(key, victoryStats.getOrDefault(key, 0) + 1);
        displayStats();
    }

    private Entity entityWinner (Entity fighter, Entity fighter2) {
        if (fighter.getHealth() == 0) {
            return fighter2;
        }
        return fighter;
    }

    private void displayStats() {
        for (String key : victoryStats.keySet()) {
            Integer cantVictory = victoryStats.get(key);
            System.out.println("La combinacion: " + key + " tiene " + cantVictory + " victorias");
        }
    }

    @Override
    public void updateDamage(Entity attacker, Entity defender) {
        // TODO Auto-generated method stub
    }

    @Override
    public void updateFighter(Entity fighter) {
        // TODO Auto-generated method stub
    }

    @Override
    public void updateWeapon(Weapon weapon) {
        // TODO Auto-generated method stub
    }
}
