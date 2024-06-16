package remotecontrol.remote;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void setUp() {
        airConditioner = mock(AirConditioner.class);
    }

    @Test
    public void testAirConditionerOn() {
        AirConditionerOnCommand onCommand = new AirConditionerOnCommand(airConditioner);
        onCommand.execute();
        verify(airConditioner).on();
    }

    @Test
    public void testAirConditionerOff() {
        AirConditionerOffCommand offCommand = new AirConditionerOffCommand(airConditioner);
        offCommand.execute();
        verify(airConditioner).off();
    }
}

