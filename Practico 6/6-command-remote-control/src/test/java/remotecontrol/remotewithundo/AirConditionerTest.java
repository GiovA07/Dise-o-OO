package remotecontrol.remotewithundo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void setUp() {
      airConditioner = mock(AirConditioner.class);
    }

    @Test
    public void testUndoAirConditionerOn() {
      AirConditionerOnCommand onCommand = new AirConditionerOnCommand(airConditioner);
      onCommand.undo();
      // se verifica que el metodo on() del objeto simulado airConditioner se haya llamado exactamente una vez durante la ejecucion del metodo undo().
      verify(airConditioner).off();
    }

    @Test
    public void testUndoAirConditionerOff() {
        AirConditionerOffCommand offCommand = new AirConditionerOffCommand(airConditioner);
        offCommand.undo();
        verify(airConditioner).on();
    }
}
