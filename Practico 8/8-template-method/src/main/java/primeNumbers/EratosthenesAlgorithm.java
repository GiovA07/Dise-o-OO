package primeNumbers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesAlgorithm extends PrimeNumbersAlgorithm {
  @Override
  public List<Integer> searchPrimeNumbers(int n) {
    List<Integer> numberPrimes = new ArrayList<>();
    boolean[] arrayAux = new boolean[n+1];
    Arrays.fill(arrayAux, true);
    for (int i = 2; i <= n; i++) {
      if(arrayAux[i] == true) {
        for (int j = i*i; j <= n; j = j + i) {
          arrayAux[j] = false;
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      if (arrayAux[i]) {
        numberPrimes.add(i);
      }
    }

    return numberPrimes;
  }

  @Override
  public void printOutput(List<Integer> numberPrimes) {
    try {
        FileWriter fileWriter = new FileWriter("printEratos.txt");
        fileWriter.write("Prime Numbers: " + numberPrimes);
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
