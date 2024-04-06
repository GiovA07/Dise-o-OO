package output;

import java.util.List;

public class OutputPrinter {

    private InterfazOutput outputPrinter;

    public OutputPrinter(InterfazOutput output) {
        this.outputPrinter = output;
    }

    public void printOutput(List<Integer> output) {
      this.outputPrinter.print(output);
    }
}
