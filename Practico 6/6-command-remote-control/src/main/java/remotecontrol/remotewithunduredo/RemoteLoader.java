package remotecontrol.remotewithunduredo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndoRedo remoteControl = new RemoteControlWithUndoRedo(3);

		AirConditioner airConditoner = new AirConditioner("Living Room");
		Command airOn = new AirConditionerOnCommand(airConditoner);
		Command airOff = new AirConditionerOffCommand(airConditoner);
		remoteControl.setCommand(0, airOn, airOff);


		CeilingFan ceilingFan = new CeilingFan("Living Room");

		Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);

		System.out.println(" \n Probando el Undo En el Control Remoto \n ");
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();

		System.out.println(" \n Probando el Redo En el Control Remoto \n ");
		remoteControl.redoButtonWasPushed();
		remoteControl.redoButtonWasPushed();
		remoteControl.redoButtonWasPushed();
	}
}
