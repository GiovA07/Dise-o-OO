package facade.remotecontrolBienHecho.remotecontrol;

public class ControlFacade {
    private RemoteControl control = new RemoteControl();

    public ControlFacade (Light light, TV tv,
                          VideoGame game, AirConditioner airConditioner) {

        tv.setInputChannel(15);
        airConditioner.setTemperature(24);
        control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        control.setCommand(1, new TVOnCommand(tv), new TVOffCommand(tv));
        control.setCommand(2, new VideoGameOn(game), new VideoGameOff(game));
        control.setCommand(3, new AirConditionerOnCommand(airConditioner), new AirConditionerOffCommand(airConditioner));
    }

    public void watchSoccerGame() {
        control.onButtonWasPushed(0);
        control.onButtonWasPushed(1);
        control.offButtonWasPushed(2);
        control.onButtonWasPushed(3);
    }

    public void finishSoccerGame() {
        control.offButtonWasPushed(0);
        control.offButtonWasPushed(1);
        control.offButtonWasPushed(3);
    }

    public void setReadingSpace() {
        control.onButtonWasPushed(0);
        control.offButtonWasPushed(1);
        control.offButtonWasPushed(2);
        control.onButtonWasPushed(3);
    }

    public void setGameMode() {
        control.offButtonWasPushed(0);
        control.offButtonWasPushed(1);
        control.onButtonWasPushed(2);
        control.onButtonWasPushed(3);
    }

    public void offGameMode() {
        control.offButtonWasPushed(2);
        control.offButtonWasPushed(3);
    }
}
