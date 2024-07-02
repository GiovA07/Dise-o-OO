package facade.remotecontrolBienHecho.remotecontrol;

public class AirConditioner {

  private String state;
  private String location;
  private int temperature;

  public AirConditioner(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("Air conditioner is ON with temperature: " + temperature);
  }

  public void off() {
    System.out.println("Air conditioner is OFF");
  }

  public void setTemperature(int temp) {
    temperature = temp;
  }

  public String getAirconditionerState() {
    return state;
  }

  public int getTemperature() {
    return temperature;
  }
}
