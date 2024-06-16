package adapter.ducks;

public class MockDrone implements Drone {
    private boolean beepCalled = false;
    private boolean spinRotorsCalled = false;
    private boolean takeOffCalled = false;

    @Override
    public void beep() {
        beepCalled = true;
    }

    @Override
    public void spin_rotors() {
        spinRotorsCalled = true;
    }

    @Override
    public void take_off() {
        takeOffCalled = true;
    }

    public boolean isBeepCalled() {
        return beepCalled;
    }

    public boolean isSpinRotorsCalled() {
        return spinRotorsCalled;
    }

    public boolean isTakeOffCalled() {
        return takeOffCalled;
    }
}
