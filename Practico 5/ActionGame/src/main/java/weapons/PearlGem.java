package weapons;

public class PearlGem extends Gems {
    public PearlGem(Weapon weapon) {
        super(weapon);
      }

      @Override
      public String getDescription() {
        return "Gema Perla, Otorga +6 de daño";
      }

      public int get_damage() {
        return 6 + weapon.get_damage();
      }

      public String getName() {
        return weapon.getName();
      }
}
