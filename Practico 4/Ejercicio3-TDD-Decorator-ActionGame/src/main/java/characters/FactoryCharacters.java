package characters;

import characters.MagicFighter.Wizard;
import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;

public class FactoryCharacters {
    public static Entity createCharacter(String type) {
        if(type.equals("knight")) {
            return new Knight();
        } else if (type.equals("archer")) {
            return new Archer();
        } else if (type.equals("wizard")) {
            return new Wizard();
        } else {
            throw new IllegalArgumentException("name character invalid");
        }
    }
}
