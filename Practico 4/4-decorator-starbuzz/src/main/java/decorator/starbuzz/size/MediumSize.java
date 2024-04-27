package decorator.starbuzz.size;

public class MediumSize implements Size {
  public String getSize() {
      return "Mediano";
  }

  public double cost() {
      return 0.05;
  }
}
