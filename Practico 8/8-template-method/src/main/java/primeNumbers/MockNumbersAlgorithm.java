package primeNumbers;

import java.util.List;

public class MockNumbersAlgorithm extends PrimeNumbersAlgorithm {
    private boolean invokedPrimeNumbers = false;
    private boolean invokedPrint = false;
    private List<Integer> printOutput;

    @Override
    List<Integer> searchPrimeNumbers(int n) {
        invokedPrimeNumbers = true;
        return printOutput;
    }

    @Override
    public void printOutput(List<Integer> numberPrimes) {
        invokedPrint = true;
        printOutput = numberPrimes;
    }


    public boolean searchPrimeNumbersIsInvoked() {
        return invokedPrimeNumbers;
    }

    public boolean printIsInvoked() {
        return invokedPrint;
    }

    public List<Integer> getPrintInput() {
        return printOutput;
    }
}
