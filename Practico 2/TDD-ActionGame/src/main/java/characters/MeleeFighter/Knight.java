package characters.MeleeFighter;

import characters.Entity;
import fightertype.FighterType;

public class Knight extends Entity {
  public Knight() {
    this.name = "Knight";
    this.health = 100;
    this.fighterType = FighterType.MELEE;
  }

  @Override
  public void display() {
    System.err.println("Soy un caballero");
  }
}
