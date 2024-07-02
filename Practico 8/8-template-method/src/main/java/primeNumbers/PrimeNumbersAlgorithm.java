package primeNumbers;

import java.util.List;

public abstract class PrimeNumbersAlgorithm {

  abstract List<Integer> searchPrimeNumbers(int n);

  abstract void printOutput(List<Integer> numberPrimes);

  public void calculatorPrimes(int n) {
    List<Integer> primeList = searchPrimeNumbers(n);
    printOutput(primeList);
  }
}
