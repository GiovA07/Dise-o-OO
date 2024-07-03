package characters;

public class Barbarian extends Entity{
    public Barbarian() {
        this.name = "Knight";
        this.health = 100;
        this.fighterType = FighterType.MELEE;
      }

      @Override
      public void display() {
        System.out.println("Soy un barbaro");
      }
}
