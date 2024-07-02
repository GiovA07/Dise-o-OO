package primeNumbers;

public class Client {
    PrimeNumbersAlgorithm algorithm;

    public Client(PrimeNumbersAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void calculateAndPrintPrimes(int n) {
        algorithm.calculatorPrimes(n);
    }


    public static void main(String[] args) {
        PrimeNumbersAlgorithm algorithm = new BasicAlgorithm();

        Client client = new Client(algorithm);
        client.calculateAndPrintPrimes(100);

        PrimeNumbersAlgorithm algorithm2 = new BasicAlgorithm();
        Client anotherClient = new Client(algorithm2);
        anotherClient.calculateAndPrintPrimes(100);
    }
}
