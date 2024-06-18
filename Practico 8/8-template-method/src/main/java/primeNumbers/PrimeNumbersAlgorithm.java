package primeNumbers;

import java.util.List;

public abstract class PrimeNumbersAlgorithm {

  abstract List<Integer> searchPrimeNumbers(int n);

  public boolean isPrime(int n) {
    boolean isPrime = true;
    int i = 2;
    while (isPrime && i < n) {
      if (n % i == 0) {
        isPrime = false;
      }
      i++;
    }
    return isPrime;
  }

  abstract void printOutput(List<Integer> numberPrimes);

}
