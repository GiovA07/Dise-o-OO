package primeNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrimeNumbersTest {
  @Test
  public void primeNumberClassicTest() {
    PrimeNumbersAlgorithm basic = new BasicAlgorithm();
    List<Integer> listBasicPrimeNumbers = basic.searchPrimeNumbers(100);
    PrimeNumbersAlgorithm eratos = new EratosthenesAlgorithm();
    List<Integer> listEratos = eratos.searchPrimeNumbers(100);

    assertIterableEquals(listBasicPrimeNumbers, listEratos);
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


    @Test
    public void primeNumberFileTest() throws IOException {
        PrimeNumbersAlgorithm algorithm = new EratosthenesAlgorithm();
        Client client = new Client(algorithm);
        client.calculateAndPrintPrimes(20);

        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("printEratos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }


        String res = str.toString();
        assertEquals("Prime Numbers: [2, 3, 5, 7, 11, 13, 17, 19]", res);
    }

}
