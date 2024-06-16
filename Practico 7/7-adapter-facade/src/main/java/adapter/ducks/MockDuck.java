package adapter.ducks;

public class MockDuck implements Duck {
    private boolean flyCalled = false;
    private boolean quackCalled = false;

    @Override
    public void fly() {
        flyCalled = true;
    }

    @Override
    public void quack() {
        quackCalled = true;
    }

    public boolean isFlyCalled() {
        return flyCalled;
    }

    public boolean isQuackCalled() {
        return quackCalled;
    }
}

