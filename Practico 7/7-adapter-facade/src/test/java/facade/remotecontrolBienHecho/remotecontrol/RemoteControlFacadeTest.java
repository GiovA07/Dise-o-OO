package facade.remotecontrolBienHecho.remotecontrol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class RemoteControlFacadeTest {

    @Test
    public void testSoccerGame() {
        TV tv = mock(TV.class);
        VideoGame videoGame = mock(VideoGame.class);
        Light light = mock(Light.class);
        AirConditioner airConditioner = mock(AirConditioner.class);

        ControlFacade controlFacade = new ControlFacade(light, tv, videoGame, airConditioner);

        controlFacade.watchSoccerGame();

        verify(tv).on();
        verify(videoGame).off();
        verify(light).on();
        verify(airConditioner).on();

        controlFacade.finishSoccerGame();
        verify(tv).off();
        verify(light).off();
        verify(airConditioner).off();
    }

    @Test
    public void testGameMode() {
        TV tv = mock(TV.class);
        VideoGame videoGame = mock(VideoGame.class);
        Light light = mock(Light.class);
        AirConditioner airConditioner = mock(AirConditioner.class);

        ControlFacade controlFacade = new ControlFacade(light, tv, videoGame, airConditioner);

        controlFacade.setGameMode();

        verify(tv).off();
        verify(videoGame).on();
        verify(light).off();
        verify(airConditioner).on();

        controlFacade.offGameMode();
        verify(airConditioner).off();
        verify(videoGame).off();
    }


}
