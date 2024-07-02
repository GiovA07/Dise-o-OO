package facade.remotecontrolBienHecho.remotecontrol;

public class AirConditionerOffCommand implements Command {
  AirConditioner airConditioner;

	public AirConditionerOffCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	public void execute() {
		airConditioner.off();
	}
}
