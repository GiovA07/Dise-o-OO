package primeNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrimeNumbersTest {
  @Test
  public void primeNumberClassicTest() {
    PrimeNumbersAlgorithm basic = new BasicAlgoritm();
    List<Integer> listBasicPrimeNumbers = basic.searchPrimeNumbers(100);
    PrimeNumbersAlgorithm eratos = new EratosthenesAlgorithm();
    List<Integer> listEratos = eratos.searchPrimeNumbers(100);

    assertIterableEquals(listBasicPrimeNumbers, listEratos);
  }

  @Test
  public void isPrimeNumber() {
    PrimeNumbersAlgorithm basic = new BasicAlgoritm();
    boolean isPrimeBasic = basic.isPrime(277);
    PrimeNumbersAlgorithm eratos = new EratosthenesAlgorithm();
    boolean isPrimeEratos = eratos.isPrime(277);

    assertTrue(isPrimeBasic);
    assertTrue(isPrimeEratos);

  }

  @Test
  public void noIsPrimeNumber() {
    PrimeNumbersAlgorithm basic = new BasicAlgoritm();
    boolean isPrimeBasic = basic.isPrime(777);
    PrimeNumbersAlgorithm eratos = new EratosthenesAlgorithm();
    boolean isPrimeEratos = eratos.isPrime(777);

    assertFalse(isPrimeBasic);
    assertFalse(isPrimeEratos);
  }

  @Test
  public void outputTest() {
    MockNumbersAlgorithm mock = new MockNumbersAlgorithm();
    List<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
    mock.printOutput(primeNumbers);
    assertTrue(mock.printIsInvoked());

    mock.searchPrimeNumbers(5);
    assertTrue(mock.searchPrimeNumbersIsInvoked());
  }





}
