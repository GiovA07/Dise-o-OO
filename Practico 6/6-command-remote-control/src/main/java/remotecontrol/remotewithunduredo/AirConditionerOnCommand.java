package remotecontrol.remotewithunduredo;

public class AirConditionerOnCommand implements Command {
	AirConditioner airConditioner;

	public AirConditionerOnCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	public void execute() {
		airConditioner.on();
	}

	@Override
	public void undo() {
		airConditioner.off();
	}
}
