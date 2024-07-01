import output.*;
import primeNumbers.*;

public class Main {
    public static void main(String[] args) {
        PrimeNumbersAlgorithm algorithmPrimeNumbers = new BasicAlgoritm();
        InterfazOutput output = new Terminal();
        PrimeClient cliente = new PrimeClient(algorithmPrimeNumbers, output);
        cliente.generatePrimes(55);


        PrimeNumbersAlgorithm algorithmPrimeNumbers2 = new EratosthenesAlgorithm();
        InterfazOutput output2 = new FileOutput("archivo.txt");
        cliente.setAlgorithm(algorithmPrimeNumbers2);
        cliente.setOutput(output2);
        cliente.generatePrimes(55);
    }

}
