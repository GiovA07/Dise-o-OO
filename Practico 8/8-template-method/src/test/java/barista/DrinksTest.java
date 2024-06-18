package barista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DrinksTest {

    @Test
    public void testLittleJuicePrepare() {
        LittleJuice littleJuice = new LittleJuice();
        littleJuice.prepareRecipe();

        assertEquals("Squeeze orange, Adding sugar and lemon", littleJuice.getSpecification());
        assertTrue(littleJuice.addIt());
    }

    @Test
    public void testSodaPrepare() {
        Soda soda = new Soda();
        soda.prepareRecipe();

        assertEquals("Filling the soda bottle with soda water, Adding coloring, Na, things", soda.getSpeciality());
        assertTrue(soda.addIt());
    }

    @Test
    public void testSpecialNewPrepare() {
        NewSpecial specialNew = new NewSpecial();
        specialNew.prepareRecipe();

        assertEquals("Secret stract of Cheese, Adding special marine sugar", specialNew.getParticularity());
        assertTrue(specialNew.addIt());
    }

}
