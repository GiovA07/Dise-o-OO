package facade.beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import facade.beverage.size.*;

public class SizeTest {
   @Test
   public void fromStringTest() {
        Size size = Size.fromString("SMALL");
        assertEquals("SMALL", size.getSize());

        size = Size.fromString("LARGE");
        assertEquals("LARGE", size.getSize());


        size = Size.fromString("MEDIUM");
        assertEquals("MEDIUM", size.getSize());

   }
}
