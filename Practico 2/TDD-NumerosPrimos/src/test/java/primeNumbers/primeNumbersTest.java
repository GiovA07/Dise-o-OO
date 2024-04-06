package primeNumbers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class primeNumbersTest {

  @ParameterizedTest
  @MethodSource("primeAlgorithms")
  public void testPrimeNumbersAlgorithm(PrimeNumbersAlgorithm algorithm) {
      List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
      assertEquals(expectedPrimes, algorithm.searchPrimeNumbers(50));
  }

  static Collection<PrimeNumbersAlgorithm> primeAlgorithms() {
    return Arrays.asList(new BasicAlgoritm(), new EratosthenesAlgorithm());
  }


  @Test
  public void primerTestDeNumerosPrimos() {
    PrimeNumbersAlgorithm algoritm = new BasicAlgoritm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
    assertEquals(expectedPrimes, primeNumbers);
  }


  @Test
  public void EratosthenesAlgorithmTest() {
    PrimeNumbersAlgorithm algoritm = new EratosthenesAlgorithm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
    assertEquals(expectedPrimes, primeNumbers);
  }


  @Test
  public void AlgoritmoRobadoTest() {
    PrimeNumbersAlgorithm algoritm = new AlgoritmoRobado();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
    assertEquals(expectedPrimes, primeNumbers);
  }

  @Test
  public void comparedAlgorithm() {
    PrimeNumbersAlgorithm algoritm = new BasicAlgoritm();
    PrimeNumbersAlgorithm algoritm2 = new EratosthenesAlgorithm();
    List<Integer> primeNumbers = algoritm.searchPrimeNumbers(50);
    List<Integer> primeNumbers2 = algoritm2.searchPrimeNumbers(50);

    assertEquals(primeNumbers, primeNumbers2);
  }

}
