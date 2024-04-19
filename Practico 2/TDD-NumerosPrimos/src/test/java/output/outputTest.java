package output;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import primeNumbers.*;


public class outputTest {
  @Test
  public void testTerminalOutput() {

      PrimeNumbersAlgorithm algoritm = new BasicAlgoritm();
      List<Integer> primeNumbers = algoritm.searchPrimeNumbers(10);
      MockOutput mockOutput = new MockOutput();
      OutputPrinter printer = new OutputPrinter(mockOutput);


      printer.printOutput(primeNumbers);

      // Assert
      assertTrue(mockOutput.printIsInvoked());
      assertEquals(primeNumbers, mockOutput.getPrintInput());
  }
}