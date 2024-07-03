package facade.beverage.size;

public abstract class Size {
  abstract public String getSize();
  abstract public double cost();

  public static Size fromString(String a) {
    if (a.equals("MEDIUM"))
        return new MediumSize();
    if (a.equals("SMALL"))
        return new SmallSize();
    if (a.equals("LARGE"))
        return new LargeSize();
    throw new IllegalArgumentException("No size valid");
}
}
