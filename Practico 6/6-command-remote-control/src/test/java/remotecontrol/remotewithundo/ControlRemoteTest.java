package remotecontrol.remotewithundo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class ControlRemoteTest {
    @Test
    public void ControlRemote() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        AirConditioner airConditioner = mock(AirConditioner.class);
        Light light = mock(Light.class);

        Command airCommandOn = new AirConditionerOnCommand(airConditioner);
        Command airCommandOff = new AirConditionerOffCommand(airConditioner);

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        remoteControl.setCommand(0, airCommandOn, airCommandOff);
        remoteControl.setCommand(1, lightOn, lightOff);

        remoteControl.onButtonWasPushed(0);
        verify(airConditioner).on();
        remoteControl.undoButtonWasPushed();
        verify(airConditioner).off();


        // when(light.getLevel()).thenReturn(100);
        // remoteControl.onButtonWasPushed(1);
        // verify(light).on();
        // assertEquals(100, light.getLevel());

        // remoteControl.offButtonWasPushed(1);
        // verify(light).off();
        // remoteControl.undoButtonWasPushed();
        // verify(light).dim(100);

    }
}
