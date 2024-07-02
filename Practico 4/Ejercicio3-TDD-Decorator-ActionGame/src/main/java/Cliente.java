import battleArena.BattleArena;
import characters.Entity;
import characters.FactoryCharacters;
import logger.FactoryObserver;
import weapons.FactoryWeapons;
import weapons.Weapon;

import java.util.Map;
import java.util.HashMap;


public class Cliente {
    private Map<String,Entity> entities;
    private BattleArena battleArena;

    public Cliente() {
        this.entities = new HashMap<>();
        this.battleArena = new BattleArena();
    }

    public void createEntity(String type, String person) {
        Entity character = FactoryCharacters.createCharacter(type);
        entities.put(person, character);
    }

    public void changeWeapon(String person, String newWeapon) {
        Entity character = entities.get(person);
        Weapon weapon = FactoryWeapons.createWeapon(newWeapon);
        character.setWeapon(weapon);
    }

    public void addGem(String person, String gem) {
        Entity character = entities.get(person);
        Weapon weapon = FactoryWeapons.addGem(gem,character.getWeapon());
        character.setWeapon(weapon);
    }

    public void startBattle(String person, String person2) {
        Entity character1 = entities.get(person);
        Entity character2 = entities.get(person2);

        battleArena.battle(character1, character2);
    }

    public void addObserver(String observer) {
        FactoryObserver.createObserver(observer, battleArena);
    }
}
