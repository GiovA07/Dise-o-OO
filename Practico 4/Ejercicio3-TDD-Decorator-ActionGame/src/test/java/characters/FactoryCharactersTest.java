package characters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import characters.MagicFighter.Wizard;
import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;

public class FactoryCharactersTest {
        @Test
    public void factoryTest() {
        Entity character = FactoryCharacters.createCharacter("wizard");
        assertTrue(character instanceof Wizard);
        character = FactoryCharacters.createCharacter("knight");
        assertTrue(character instanceof Knight);
        character = FactoryCharacters.createCharacter("archer");
        assertTrue(character instanceof Archer);
    }

        @Test
    public void errorFactoryWeapon() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactoryCharacters.createCharacter("lol");
        });

        assertEquals("name character invalid", exception.getMessage());
    }
}
