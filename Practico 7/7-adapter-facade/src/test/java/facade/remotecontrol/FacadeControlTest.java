package facade.remotecontrol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class FacadeControlTest {

    private RemoteControl remoteControlMock;
    private FacadeControl facadeControl;

    @BeforeEach
    public void setUp() {
        remoteControlMock = mock(RemoteControl.class);
        facadeControl = new FacadeControl(remoteControlMock);
    }

    @Test
    public void testSetupWatchTV() {
        facadeControl.setupWatchTV();
        verify(remoteControlMock).setCommand(eq(0), any(LightOnCommand.class), any(LightOffCommand.class));
        verify(remoteControlMock).setCommand(eq(1), any(StereoOnWithCDCommand.class), any(StereoOffCommand.class));
        verify(remoteControlMock).setCommand(eq(2), any(TVOnCommand.class), any(TVOffCommand.class));
        verify(remoteControlMock).setCommand(eq(3), any(AirConditionerOnCommand.class), any(AirConditionerOffCommand.class));
    }

    @Test
    public void testWatchGame() {
        facadeControl.setupWatchTV();
        facadeControl.watchGame();

        verify(remoteControlMock).onButtonWasPushed(0);
        verify(remoteControlMock).onButtonWasPushed(1);
        verify(remoteControlMock).onButtonWasPushed(2);
        verify(remoteControlMock).onButtonWasPushed(3);
    }
}
