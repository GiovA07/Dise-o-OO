package weapons;

public class SaphireGem extends Gems{
    public SaphireGem(Weapon weapon) {
        super(weapon);
      }

      @Override
      public String getDescription() {
        return "Gema Saphire, Otorga +7 de daño";
      }

      public int get_damage() {
        return 7 + weapon.get_damage();
      }

      public String getName() {
        return weapon.getName();
      }
}
