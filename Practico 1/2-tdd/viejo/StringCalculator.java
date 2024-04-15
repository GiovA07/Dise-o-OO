package stringcalculator;

import java.util.List;
import java.util.logging.Logger;

import output.*;

import java.util.ArrayList;

public class StringCalculator {

    private String numbers;
    private Delimiter delimiter = new Delimiter();
    private ILogger logger;

    public StringCalculator(ILogger logger) {
        this.logger = logger;
    }

    public int add(String numbers) { //TODO: CAMBIAR NOMBRE
        if (numbers.isEmpty())
            return 0;

        if (Delimiter.hasDelimiterCustom(numbers)) {
            List<String> newDelimtiers = delimiter.extractDelimiters(numbers); //TODO: HACE MAS DE UNA COSA?
            delimiter.addDelimiters(newDelimtiers);
        }
        String[] numberParts = splitNumbers(numbers, delimiter);
        int addition = additionNumbers(numberParts);

        // Log the sum result
        logger.write("Sum result: " + addition);
        return addition;
    }

    private String[] splitNumbers(String numbers, Delimiter delimiter) {
        List<String> delimiters = delimiter.getDelimiter();
        String stringWithoutDelimiter = numbers;

        if (Delimiter.hasDelimiterCustom(numbers)) {
            stringWithoutDelimiter = Delimiter.removeDelimiter(numbers);
        }

        List<String> resultNumbersParts = new ArrayList<>();
        List<String> currentParts = new ArrayList<>();
        currentParts.add(stringWithoutDelimiter);

        for (String delimit : delimiters) {
            List<String> temporaryParts = new ArrayList<>();

            for (String part : currentParts) {
                List<String> aux = customSplit(part, delimit);
                addNumericParts(aux, resultNumbersParts);
                addNonNumericParts(aux, temporaryParts);
            }
            currentParts = temporaryParts;
        }
        return resultNumbersParts.toArray(new String[0]);
    }

    private void addNonNumericParts(List<String> source, List<String> destination) {
        for (String num : source) {
            try {
                Integer.parseInt(num);
            } catch (NumberFormatException e) {
                destination.add(num);
            }
        }
    }

    private void addNumericParts(List<String> source, List<String> destination) {
        for (String s : source) {
            try {
                Integer.parseInt(s);
                destination.add(s);
            } catch (NumberFormatException e) {
                // La cadena no representa un numero valido, la ignoramos
            }
        }
    }

    private static List<String> customSplit(String numbers, String delimiter) {
        List<String> parts = new ArrayList<>();
        int delimiterLenght = delimiter.length();

        while (!numbers.isEmpty()) {
            int delimiterIndex = numbers.indexOf(delimiter);
            if (delimiterIndex == -1) {
                parts.add(numbers);
                break;
            }

            String number = numbers.substring(0, delimiterIndex);
            parts.add(number);
            int indexFinalyDelimiter = delimiterIndex + delimiterLenght;
            numbers = numbers.substring(indexFinalyDelimiter, numbers.length());
        }
        return parts;
    }

    private static int additionNumbers(String[] numbers) {
        int sumaRealizada = 0;
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            sumaRealizada += number;
        }
        return sumaRealizada;
    }
}
