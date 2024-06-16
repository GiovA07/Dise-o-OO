package remotecontrol.remote;

public class Test {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();

    AirConditioner airConditioner = new AirConditioner();
    Command airOn = new AirConditionerOnCommand(airConditioner);
    Command airOff = new AirConditionerOffCommand(airConditioner);

    remote.setCommand(0, airOn, airOff);

    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    System.out.println(remote);
  }
}
