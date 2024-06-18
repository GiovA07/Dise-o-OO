package primeNumbers;
import java.util.ArrayList;
import java.util.List;

public class BasicAlgoritm extends PrimeNumbersAlgorithm {

    @Override
    public List<Integer> searchPrimeNumbers(int n) {
      List<Integer> numberPrimes = new ArrayList<>();

      for (int i = 2; i < n; i++) {
        if(isPrime(i)) {
          numberPrimes.add(i);
        }
      }
      return numberPrimes;
    }


    @Override
    public void printOutput(List<Integer> numberPrimes) {
      System.out.println("Prime Numers: " + numberPrimes);
    }
}
