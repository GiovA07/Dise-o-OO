package weapons;

import fightertype.FighterType;

public class AstralBall extends Weapon{
  public AstralBall() {
    this.damage = 10;
    this.fighterType = FighterType.MAGIC;
  }

  @Override
  public String getName() {
      return "AstralBall";
  }

}
