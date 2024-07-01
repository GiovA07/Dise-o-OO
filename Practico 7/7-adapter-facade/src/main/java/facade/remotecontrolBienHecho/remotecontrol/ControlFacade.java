package facade.remotecontrolBienHecho.remotecontrol;


public class ControlFacade {

    private Light light;
    private Stereo stereo;
    private Frezze frezze;
    private TV tv;
    private AirConditioner airConditioner;

    public ControlFacade (Light light, TV tv, Stereo stereo,
                          Frezze frezze, AirConditioner airConditioner) {
        this.light = light;
        this.tv = tv;
        this.stereo = stereo;
        this.frezze = frezze;
        this.airConditioner = airConditioner;
    }

    public void initDivices() {
        light.on();
        tv.on();
        stereo.on();
        frezze.on();
        airConditioner.on();
    }

    public void endDivices() {
        light.off();
        tv.off();
        stereo.off();
        frezze.off();
        airConditioner.off();
    }

    public void watchSoccerGame() {
        light.on();
        tv.on();
        stereo.on();
        frezze.on();
        airConditioner.on();

        frezze.two();
        tv.setInputChannel(22);
        stereo.setVolume(50);
        airConditioner.setTemperature(24);
    }

    public void finishSoccerGame() {
        frezze.one();
        tv.setInputChannel(15);
        stereo.off();
        airConditioner.off();
    }

    public void setReadingSpace() {
        tv.off();
        stereo.off();
        airConditioner.on();
        airConditioner.setTemperature(26);
    }

    public void normalizeSpace() {
        tv.on();
        tv.setInputChannel(33);
        light.dim(25);
        stereo.setVolume(30);
        airConditioner.setTemperature(20);
    }
}
