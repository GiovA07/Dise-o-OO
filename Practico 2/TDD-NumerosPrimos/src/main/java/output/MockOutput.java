package output;

import java.util.List;

public class MockOutput implements InterfazOutput {

    private boolean invoked = false;
    private List<Integer> printInput;


    @Override
    public void print(List<Integer> toPrint) {
        invoked = true;
        printInput = toPrint;
    }

    public boolean printIsInvoked() {
        return invoked;
    }

    public List<Integer> getPrintInput() {
        return printInput;
    }
}
