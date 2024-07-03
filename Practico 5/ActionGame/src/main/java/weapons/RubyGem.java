package weapons;

public class RubyGem extends Gems{

  public RubyGem(Weapon weapon) {
    super(weapon);
  }

  @Override
  public String getDescription() {
    return "Gema Ruby, Otorga +5 de daño";
  }

  public int get_damage() {
    return 5 + weapon.get_damage();
  }

  public String getName() {
    return weapon.getName();
  }

}
