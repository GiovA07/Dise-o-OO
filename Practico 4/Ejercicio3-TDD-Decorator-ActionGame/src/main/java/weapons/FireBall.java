package weapons;

import fightertype.FighterType;
public class FireBall extends Weapon {

  public FireBall() {
    this.damage = 10;
    this.fighterType = FighterType.MAGIC;
  }

  public String getName() {
    return "FireBall";
  }

}
