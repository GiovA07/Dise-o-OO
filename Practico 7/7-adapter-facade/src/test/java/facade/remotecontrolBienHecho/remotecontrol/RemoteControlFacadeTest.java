package facade.remotecontrolBienHecho.remotecontrol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoteControlFacadeTest {

    @Test
    public void initializationAndEnding() {
        TV tv = new TV("Cocina");
        Frezze frezze = new Frezze("Cocina");
        Light light = new Light("Cocina");
        Stereo stereo = new Stereo("Cocina");
        AirConditioner airConditioner = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();
        ControlFacade controlFacade = new ControlFacade(light, tv, stereo, frezze, airConditioner);

        InitDivices initDivices = new InitDivices(controlFacade);
        EndDivices endDivices = new EndDivices(controlFacade);

        remoteControl.setCommand(0, initDivices, endDivices);
        remoteControl.onButtonWasPushed(0);

        assertEquals(100, light.getLevel());
        assertEquals("TV is on", tv.getTVState());
        assertEquals("stereo is on", stereo.getStereoState());
        assertEquals("Frezze is on", frezze.getFrezzeState());
        assertEquals("Air conditioner is ON", airConditioner.getAirconditionerState());

        remoteControl.offButtonWasPushed(0);
        assertEquals(0, light.getLevel());
        assertEquals("TV is off", tv.getTVState());
        assertEquals("stereo is off", stereo.getStereoState());
        assertEquals("Frezze is off", frezze.getFrezzeState());
        assertEquals("Air conditioner is OFF", airConditioner.getAirconditionerState());

    }

    @Test
    public void testSoccerGame() {
        TV tv = new TV("Sala");
        Frezze frezze = new Frezze("Sala");
        Light light = new Light("Sala");
        Stereo stereo = new Stereo("Sala");
        AirConditioner airConditioner = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();
        ControlFacade controlFacade = new ControlFacade(light, tv, stereo, frezze, airConditioner);

        WatchSoccerGame watchSoccerGame = new WatchSoccerGame(controlFacade);
        FinishSoccerGame finishSoccerGame = new FinishSoccerGame(controlFacade);

        remoteControl.setCommand(0, watchSoccerGame, finishSoccerGame);
        remoteControl.onButtonWasPushed(0);

        assertEquals("Frezze is now in 2°", frezze.getFrezzeState());
        assertEquals(22, tv.getChannel());
        assertEquals(50, stereo.getVolume());
        assertEquals(24, airConditioner.getTemperature());

        remoteControl.offButtonWasPushed(0);
        assertEquals("Frezze is now in 1°", frezze.getFrezzeState());
        assertEquals(15, tv.getChannel());
        assertEquals("stereo is off", stereo.getStereoState());
        assertEquals("Air conditioner is OFF", airConditioner.getAirconditionerState());
    }

}
