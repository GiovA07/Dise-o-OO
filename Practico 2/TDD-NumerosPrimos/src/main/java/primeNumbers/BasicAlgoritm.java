package primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class BasicAlgoritm implements PrimeNumbersAlgorithm {

    @Override
    public List<Integer> searchPrimeNumbers(int n) {
      List<Integer> listPrime = new ArrayList<>();

      for (int i = 2; i < n; i++) {
        if(isPrime(i)) {
          listPrime.add(i);
        }
      }
      return listPrime;
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
}
