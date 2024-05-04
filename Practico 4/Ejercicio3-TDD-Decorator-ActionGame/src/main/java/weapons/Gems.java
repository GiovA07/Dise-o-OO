package weapons;

public abstract class Gems extends Weapon {
	static int maxGems = 3;
	Weapon weapon;

	public Gems(Weapon weapon) {
    if (weapon.cantGems() < maxGems){
      this.weapon = weapon;
    } else {
      throw new IllegalArgumentException("Maximum number of gems exceeded");
    }
	}

	@Override
	public int cantGems() {
		return 1 + weapon.cantGems();
	}

	public abstract String getDescription();
}
