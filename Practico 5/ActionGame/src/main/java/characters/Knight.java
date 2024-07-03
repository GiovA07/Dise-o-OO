package characters;

public class Knight extends Entity {
  public Knight() {
    this.name = "Knight";
    this.health = 100;
    this.fighterType = FighterType.MELEE;
  }

  @Override
  public void display() {
    System.out.println("Soy un caballero");
  }
}
