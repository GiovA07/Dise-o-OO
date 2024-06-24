package remotecontrol.remotewithunduredo;

public class AirConditionerOffCommand implements Command {
  AirConditioner airConditioner;

	public AirConditionerOffCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	public void execute() {
		airConditioner.off();
	}

	@Override
	public void undo() {
		airConditioner.on();
	}
}
