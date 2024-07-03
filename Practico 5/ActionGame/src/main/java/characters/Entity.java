package characters;

import weapons.FistBumps;
import weapons.Weapon;

/**
 * CharacterInterface
 */
public abstract class Entity {
  protected String name;
  protected int health;
  protected FighterType fighterType;
  protected Weapon weapon = new FistBumps();

  public int getHealth() {
    return health;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    if (weapon.get_TypeWeapon() == this.fighterType)
      this.weapon = weapon;
    else
      throw new IllegalStateException("The weapon does not belong to the character's type.");

  }

  public FighterType get_FighterType() {
    return fighterType;
  }

  public String getName() {
    return name;
  }


  public void attack(Entity target) {
    if (target.isAlive())
      target.takeDamage(weapon.get_damage());
    else
      throw new IllegalStateException("the character is weakened");

  }

  private void takeDamage(int damage) {
      health -= damage;
      if (health < 0) {
          health = 0;
      }
  }

  protected abstract void display();

  public boolean isAlive() {
    return health != 0;
  }

}
