package remotecontrol.remotewithundo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * MacroCommandTest
 */
public class MacroCommandTest {
    private RemoteControlWithUndo remoteControl;
    private AirConditioner airConditioner;
    private CeilingFan ceiling;
    private Command airConditionerOn;
    private Command airConditionerOff;
    private Command ceilingHigh;
    private Command ceilingOff;
    private Command[] onCommands;
    private Command[] offCommands;

    @BeforeEach
    public void setUp() {
        remoteControl = new RemoteControlWithUndo();
        airConditioner = mock(AirConditioner.class);
        ceiling = mock(CeilingFan.class);
        airConditionerOn = new AirConditionerOnCommand(airConditioner);
        airConditionerOff = new AirConditionerOffCommand(airConditioner);

        ceilingHigh = new CeilingFanHighCommand(ceiling);
        ceilingOff = new CeilingFanOffCommand(ceiling);

        onCommands = new Command[] { airConditionerOn, ceilingHigh };
        offCommands = new Command[] { airConditionerOff, ceilingOff };
    }

  @Test
  public void testMacroCommandExecute() {
      Command airCommand = mock(AirConditionerOnCommand.class);
      Command lightCommand = mock(LightOnCommand.class);
      Command dimmerLightCommand = mock(DimmerLightOnCommand.class);

      Command[] commands = { airCommand, lightCommand, dimmerLightCommand };

      MacroCommand macroCommand = new MacroCommand(commands);

      macroCommand.execute();

      // Verifica que el metodo execute se llame en cada comando
      verify(airCommand).execute();
      verify(lightCommand).execute();
      verify(dimmerLightCommand).execute();
  }


  @Test
  public void testMacroCommandExecuteRemoteControl() {
    // Command airCommand = mock(AirConditionerOnCommand.class);
    // Command lightCommand = mock(LightOnCommand.class);
    // Command dimmerLightCommand = mock(DimmerLightOnCommand.class);

    // Command[] commands = { airCommand, lightCommand, dimmerLightCommand };
    Command partyOn = new MacroCommand(onCommands);
    Command partyOff = new MacroCommand(offCommands);

    remoteControl.setCommand(0, partyOn, partyOff);

    remoteControl.onButtonWasPushed(0);
    verify(airConditioner).on();
    verify(ceiling).high();

    remoteControl.offButtonWasPushed(0);
    verify(airConditioner).off();
    verify(ceiling).off();
  }

  @Test
  public void testMacroCommandExecuteRemoteControlUndo() {
    Command partyOn = new MacroCommand(onCommands);
    Command partyOff = new MacroCommand(offCommands);

    remoteControl.setCommand(0, partyOn, partyOff);

    remoteControl.onButtonWasPushed(0);
    verify(airConditioner).on();
    verify(ceiling).high();

    remoteControl.undoButtonWasPushed();
    verify(airConditioner).off();
    verify(ceiling).off();
  }

@Test
public void testMacroCommandUndo() {
    Command airCommand = mock(AirConditionerOnCommand.class);
    Command lightCommand = mock(LightOnCommand.class);
    Command dimmerLightCommand = mock(DimmerLightOnCommand.class);


    Command[] commands = { airCommand, lightCommand, dimmerLightCommand };

    MacroCommand macroCommand = new MacroCommand(commands);

    macroCommand.undo();

    verify(airCommand).undo();
    verify(lightCommand).undo();
    verify(dimmerLightCommand).undo();
}

}
