package weapons;

public class AmethystGem extends Gems {
    public AmethystGem(Weapon weapon) {
        super(weapon);
      }

      @Override
      public String getDescription() {
        return "Gema Amatista, Otorga +10 de daño";
      }

      public int get_damage() {
        return 10 + weapon.get_damage();
      }

      public String getName() {
        return weapon.getName();
      }
}
