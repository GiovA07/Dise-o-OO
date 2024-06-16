package facade.remotecontrol;

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

    public String getState() {
        return state;
    }

    public void undo(String state) {
        if (state.equals("Frezze is on")) {
            on();
        } else if (state.equals("Frezze is off")) {
            off();
        } else if (state.equals("Frezze is now in 1°")) {
            one();
        } else if (state.equals("Frezze is now in 2°")) {
            two();
        } else if (state.equals("Frezze is now in 3°")) {
            three();
        } else {
            throw new IllegalArgumentException("the actual state is invalid");
        }
    }
}
