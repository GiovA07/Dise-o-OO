package weapons;

import characters.FighterType;

public class AstralBall extends Weapon{
  public AstralBall() {
    this.damage = 15;
    this.fighterType = FighterType.MAGIC;
  }

  public String getName() {
    return "AstralBall";
  }

}
