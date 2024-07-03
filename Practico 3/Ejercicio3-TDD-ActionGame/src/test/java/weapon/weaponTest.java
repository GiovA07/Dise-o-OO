package weapon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fightertype.FighterType;
import weapons.*;

public class weaponTest {
  //Weapon
  @Test
  public void swordTest() {
    Weapon sword = new Sword();
    assertEquals(70, sword.get_damage());
    assertEquals(FighterType.MELEE, sword.get_TypeWeapon());
  }

  @Test
  public void fireBallTest() {
    Weapon weapon = new FireBall();
    assertEquals(50, weapon.get_damage());
    assertEquals(FighterType.MAGIC, weapon.get_TypeWeapon());
  }

  @Test
  public void archTest() {
    Weapon weapon = new Arch();
    assertEquals(50, weapon.get_damage());
    assertEquals(FighterType.RANGED, weapon.get_TypeWeapon());
  }

}
