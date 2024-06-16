package facade.remotecontrol;

public class FacadeControl {
  private RemoteControl remoteControl;

  public FacadeControl(RemoteControl remoteControl) {
    this.remoteControl = remoteControl;
  }

  public void setupWatchTV() {
    Light light = new Light("Living");
    Stereo stereo = new Stereo("Living");
    TV tv = new TV("Living");
    AirConditioner airConditioner = new AirConditioner();

    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightOffCommand livingRoomLightOff = new LightOffCommand(light);

    StereoOnWithCDCommand livingRoomStereoOn = new StereoOnWithCDCommand(stereo);
    StereoOffCommand livingRoomStereoOff = new StereoOffCommand(stereo);

    TVOnCommand TVOn = new TVOnCommand(tv);
    TVOffCommand TVOff = new TVOffCommand(tv);

    AirConditionerOnCommand airConditionerOn = new AirConditionerOnCommand(airConditioner);
    AirConditionerOffCommand airConditionerOff = new AirConditionerOffCommand(airConditioner);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, livingRoomStereoOn, livingRoomStereoOff);
    remoteControl.setCommand(2, TVOn, TVOff);
    remoteControl.setCommand(3, airConditionerOn, airConditionerOff);
  }

  public void watchGame() {
    remoteControl.onButtonWasPushed(0); //lights
    remoteControl.onButtonWasPushed(1); // stereo
    remoteControl.onButtonWasPushed(2); // TV
    remoteControl.onButtonWasPushed(3); // conditioner
  }

}
