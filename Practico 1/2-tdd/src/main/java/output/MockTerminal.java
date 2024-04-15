package output;

public class MockTerminal implements Output {
    private String msg;
    private boolean invoked = false;
    @Override
    public void print(int toPrint) {
        invoked = true;
        if (!(toPrint == 2017)) {
            throw new Error("Invalid mock call");
        }
    }

    public boolean isInvoked() {
        return invoked;
    }
}
