package remotecontrol.remotewithunduredo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RemoteControlWithUnduRedoTest {

    @Test
    public void redoTest() {
        AirConditioner airConditioner =  mock(AirConditioner.class);
        Light light =  mock(Light.class);
        CeilingFan ceilingFan =  mock(CeilingFan.class);

        Command airOn = new AirConditionerOnCommand(airConditioner);
        Command airOff = new AirConditionerOffCommand(airConditioner);
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command ceilingOMedium = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingOff = new CeilingFanOffCommand(ceilingFan);

        RemoteControlWithUndoRedo control = new RemoteControlWithUndoRedo(3);
        control.setCommand(0, airOn, airOff);
        control.setCommand(1, lightOn, lightOff);
        control.setCommand(2, ceilingOMedium, ceilingOff);

        control.onButtonWasPushed(0);
        verify(airConditioner).on();
        control.onButtonWasPushed(1);
        control.onButtonWasPushed(2);

        control.undoButtonWasPushed();
        verify(ceilingFan).off();

        control.undoButtonWasPushed();
        verify(light).dim(0);

        control.undoButtonWasPushed();
        verify(airConditioner).off();

        //redo test
        control.redoButtonWasPushed();
        verify(airConditioner,times(2)).on();
        control.redoButtonWasPushed();
        verify(light,times(2)).on();
        control.redoButtonWasPushed();
        verify(ceilingFan,times(2)).medium();
    }
}
