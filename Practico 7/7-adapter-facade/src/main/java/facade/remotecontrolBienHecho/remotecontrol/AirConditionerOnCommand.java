package facade.remotecontrolBienHecho.remotecontrol;

public class AirConditionerOnCommand implements Command {
	AirConditioner airConditioner;

	public AirConditionerOnCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	public void execute() {
		airConditioner.on();
	}
}
