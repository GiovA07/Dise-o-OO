package adapter.ducks;

public class MockTurkey implements Turkey{

    private boolean isGobbleCalled = false;
    private boolean isFlyCalled = false;

    @Override
    public void gobble() {
        isGobbleCalled = true;
    }

    @Override
    public void fly() {
        isFlyCalled = true;
    }

    public boolean isFlyCalled() {
        return isFlyCalled;
    }

    public boolean isGobbleCalled() {
        return isGobbleCalled;
    }
}
