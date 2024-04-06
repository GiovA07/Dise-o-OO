package primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoRobado implements PrimeNumbersAlgorithm {

    @Override
    public List<Integer> searchPrimeNumbers(int n) {
        List<Integer> numberPrimes = new ArrayList<>();
        int i, j;
        for (j = 2; j <= n; j++) {    // j es el número que se comprueba si es primo
            i = 2;                // i son los divisores
            while (j % i != 0) {
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo
                numberPrimes.add(j);
            }
        }
        return numberPrimes;
    }
}
