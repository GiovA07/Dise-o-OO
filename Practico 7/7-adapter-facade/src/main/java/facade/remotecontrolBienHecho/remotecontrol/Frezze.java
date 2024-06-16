package facade.remotecontrolBienHecho.remotecontrol;

public class Frezze {

    String location;
    String temperature;
    String state;

    public Frezze(String loc) {
        this.location = loc;
        this.temperature = "1";
        this.state = "Frezze is off";
    }

    public void on() {
        state = "Frezze is on";
    }

    public void off() {
        state = "Frezze is off";
    }

    public void one() {
        this.temperature = "1";
        state = "Frezze is now in " + temperature + "°";
    }

    public void two() {
        this.temperature = "2";
        state = "Frezze is now in " + temperature + "°";
    }

    public void three() {
        this.temperature = "3";
        state = "Frezze is now in " + temperature + "°";
    }

    public String getFrezzeState() {
        return state;
    }

}
