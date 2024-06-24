package remotecontrol.remotewithundo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingRoomLightOn =
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff =
				new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanMediumCommand ceilingFanMedium =
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh =
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();


		AirConditioner airConditoner = new AirConditioner("Living Room");
		Command airOn = new AirConditionerOnCommand(airConditoner);
		Command airOff = new AirConditionerOffCommand(airConditoner);
		remoteControl.setCommand(0, airOn, airOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		System.out.println(remoteControl);


		System.out.println(" \n Probando el Macro En el Control Remoto \n ");
		Command[] onCommands = {airOn, ceilingFanMedium, livingRoomLightOn};
		Command[] offCommands = {airOff, ceilingFanOff, livingRoomLightOff};
		MacroCommand macroON= new MacroCommand(onCommands);
		MacroCommand macroOFF = new MacroCommand(offCommands);

		RemoteControlWithUndo remoteControlMacro = new RemoteControlWithUndo();
		remoteControlMacro.setCommand(0, macroON, macroOFF);

		System.out.println(" \n Ejecutando los ON \n ");
		remoteControlMacro.onButtonWasPushed(0);
		System.out.println(" \n Ejecutando los OFF \n ");
		remoteControlMacro.offButtonWasPushed(0);
		System.out.println(" \n Ejecutando el Undo \n ");
		remoteControlMacro.undoButtonWasPushed();
	}
}
