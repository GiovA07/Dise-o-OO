package primeNumbers;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class primeNumbersTest {

  @Test
  public void primerTestDeNumerosPrimos() {
    PrimeNumbersAlgorithm algoritm = new BasicAlgoritm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(50);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    assertEquals(expectedPrimes, primeNumbers);
  }


  @Test
  public void EratosthenesAlgorithmTest() {
    PrimeNumbersAlgorithm algoritm = new EratosthenesAlgorithm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    assertEquals(expectedPrimes, primeNumbers);
  }


  @Test
  public void AlgoritmoRobadoTest() {
    PrimeNumbersAlgorithm algoritm = new AlgoritmoRobado();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    assertEquals(expectedPrimes, primeNumbers);
  }

  @Test
  public void comparedAlgorithm() {
    PrimeNumbersAlgorithm algoritm = new BasicAlgoritm();
    PrimeNumbersAlgorithm algoritm2 = new EratosthenesAlgorithm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(100);
    List<Integer> primeNumbers2 = algoritm2.searchPrimeNumbers(100);

    assertEquals(primeNumbers, primeNumbers2);
  }

}
