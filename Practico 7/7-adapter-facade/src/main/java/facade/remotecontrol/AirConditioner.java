package facade.remotecontrol;

public class AirConditioner {

  private String state;
  private int temperature;

  public void on() {
      state = "Air conditioner is ON";
  }

  public void off() {
      state = "Air conditioner is OFF";
  }

  public void setTemperature(int temp) {
    temperature = temp;
  }

  public String getState() {
    return state;
  }

  public int getTemperature() {
    return temperature;
  }
}

