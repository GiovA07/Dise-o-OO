package weapons;

import fightertype.FighterType;
public class FireBall extends Weapon {

  public FireBall() {
    this.damage = 5;
    this.fighterType = FighterType.MAGIC;
  }

  @Override
  public String getName() {
      return "FireBall";
  }

}
