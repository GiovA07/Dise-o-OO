package primeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesAlgorithm implements PrimeNumbersAlgorithm {
  @Override
  public List<Integer> searchPrimeNumbers(int n) {
    boolean[] arrayAux = new boolean[n+1];
    Arrays.fill(arrayAux, true);
    for (int i = 2; i <= n; i++) {
      if(arrayAux[i] == true) {
        for (int j = i*i; j <= n; j = j + i) {
          arrayAux[j] = false;
        }
      }
    }


    List<Integer> primeList = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      if (arrayAux[i]) {
        primeList.add(i);
      }
    }

    return primeList;
  }
}
