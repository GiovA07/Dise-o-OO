package primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class BasicAlgorithm extends PrimeNumbersAlgorithm {

  @Override
  public List<Integer> searchPrimeNumbers(int n) {
    List<Integer> numberPrimes = new ArrayList<>();

    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        numberPrimes.add(i);
      }
    }
    return numberPrimes;
  }

  private boolean isPrime(int n) {
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

  @Override
  public void printOutput(List<Integer> numberPrimes) {
    System.out.println("Prime Numers: " + numberPrimes);
  }
}
