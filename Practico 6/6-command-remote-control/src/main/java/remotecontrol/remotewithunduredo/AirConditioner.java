package remotecontrol.remotewithunduredo;

public class AirConditioner {
  String location;

  public AirConditioner(String location) {
		this.location = location;
	}

  public void on() {
      System.out.println("Air conditioner is ON");
  }

  public void off() {
      System.out.println("Air conditioner is OFF");
  }
}

