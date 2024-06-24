package remotecontrol.remote;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ControlRemoteTest {
  @Test
  public void ControlRemote(){
    RemoteControl remoteControl = new RemoteControl();
    AirConditioner airConditioner = mock(AirConditioner.class);

    Command airCommandOn = new AirConditionerOnCommand(airConditioner);
    Command airCommandOff = new AirConditionerOffCommand(airConditioner);

    remoteControl.setCommand(0, airCommandOn, airCommandOff);

    remoteControl.onButtonWasPushed(0);
    verify(airConditioner).on();

    remoteControl.offButtonWasPushed(0);
    verify(airConditioner).off();

  }
}
