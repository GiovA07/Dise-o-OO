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
    assertEquals(15, sword.get_damage());
    assertEquals(FighterType.MELEE, sword.get_TypeWeapon());
  }

  @Test
  public void fireBallTest() {
    Weapon weapon = new FireBall();
    assertEquals(10, weapon.get_damage());
    assertEquals(FighterType.MAGIC, weapon.get_TypeWeapon());
  }

  @Test
  public void archTest() {
    Weapon weapon = new Arch();
    assertEquals(10, weapon.get_damage());
    assertEquals(FighterType.RANGED, weapon.get_TypeWeapon());
  }



  //pattern Decorator
  @Test
  public void rubyGemWeponTest() {
    Weapon weapon = new Sword();
    weapon = new RubyGem(weapon);
    assertEquals(15+5, weapon.get_damage());
    assertEquals(4, weapon.get_maxGems());
    assertEquals(1, weapon.cantGems());

  }

  @Test
  public void SaphireGemFirstBumpsTest() {
    Weapon weapon = new FistBumps();
    weapon = new SaphireGem(weapon);
    assertEquals(10+7, weapon.get_damage());
    assertEquals(6, weapon.get_maxGems());
    assertEquals(1, weapon.cantGems());
  }

  @Test
  public void maxGemsWeponSwordTest() {
    Weapon weapon = new Sword();
    weapon = new RubyGem(weapon);
    weapon = new RubyGem(weapon);
    weapon = new RubyGem(weapon);
    weapon = new RubyGem(weapon);
    assertEquals(15+20, weapon.get_damage());
    assertEquals(4, weapon.get_maxGems());
    assertEquals(4, weapon.cantGems());

    final Weapon finalWeapon = weapon; // Declarar la variable final
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        new RubyGem(finalWeapon);
    });

    assertEquals("Maximum number of gems exceeded", exception.getMessage());
  }

  @Test
  public void maxGemsFistBumpsTest() {
    Weapon weapon = new FistBumps();
    weapon = new RubyGem(weapon);
    weapon = new RubyGem(weapon);
    weapon = new RubyGem(weapon);
    weapon = new SaphireGem(weapon);
    weapon = new SaphireGem(weapon);
    weapon = new SaphireGem(weapon);

    assertEquals(10+15+7+7+7, weapon.get_damage());
    assertEquals(6, weapon.get_maxGems());
    assertEquals(6, weapon.cantGems());

    final Weapon finalWeapon = weapon; // Declarar la variable final
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        new RubyGem(finalWeapon);
    });

    assertEquals("Maximum number of gems exceeded", exception.getMessage());
  }

  @Test
  public void maxGemsWeponFireBallTest() {
    Weapon weapon = new FireBall();
    weapon = new SaphireGem(weapon);
    weapon = new RubyGem(weapon);
    weapon = new SaphireGem(weapon);
    assertEquals(10+7+5+7, weapon.get_damage());
    assertEquals(3, weapon.get_maxGems());
    assertEquals(3, weapon.cantGems());

    final Weapon finalWeapon = weapon; // Declarar la variable final
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        new RubyGem(finalWeapon);
    });

    assertEquals("Maximum number of gems exceeded", exception.getMessage());
  }
}
