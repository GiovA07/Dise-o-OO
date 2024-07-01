import java.util.List;
import output.*;
import primeNumbers.*;

public class PrimeClient {

    private  PrimeNumbersAlgorithm primeGenerator;
    private  InterfazOutput outputStrategy;

    public PrimeClient(PrimeNumbersAlgorithm primeGenerator, InterfazOutput outputStrategy) {
        this.primeGenerator = primeGenerator;
        this.outputStrategy = outputStrategy;
    }

    public void setAlgorithm(PrimeNumbersAlgorithm newAlgorithm) {
        this.primeGenerator = newAlgorithm;
    }

    public void setOutput(InterfazOutput newOutput) {
        this.outputStrategy = newOutput;
    }


    public void generatePrimes(int n) {
        List<Integer> primes = primeGenerator.searchPrimeNumbers(n);
        outputStrategy.print(primes);
    }
}
