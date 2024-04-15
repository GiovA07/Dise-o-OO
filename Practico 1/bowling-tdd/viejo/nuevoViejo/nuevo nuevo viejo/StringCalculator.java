package stringcalculator;

import java.util.List;
import java.util.ArrayList;

public class StringCalculator {

    private String numbers;
    private Delimiter delimiter = new Delimiter();

    public StringCalculator(String numbers) {
        this.numbers = numbers;
    }

    public int add() {
        if (numbers.isEmpty())
            return 0;

        delimiter.detectDelimiter(numbers);

        String[] numberParts;
        if (delimiter.isMultiDelimiters()) {
            numberParts = splitByMultipleDelimiters();
        } else {
            numberParts = splitNumbersByDelimiter(numbers, delimiter);
        }
        int addition = additionNumbers(numberParts);
        return addition;
    }

    private String[] splitByMultipleDelimiters() {
        String[] delimiters = delimiter.getMultDelimiter();
        String stringWithoutDelimiter = Delimiter.removeDelimiter(numbers);

        List<String> resultNumbersParts = new ArrayList<>();
        List<String> currentParts = new ArrayList<>();
        currentParts.add(stringWithoutDelimiter);

        for (String delimiter : delimiters) {
            List<String> temporaryParts = new ArrayList<>();

            for (String part : currentParts) {
                List<String> aux = customSplit(part, delimiter);
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

    private String[] splitNumbersByDelimiter (String numbers, Delimiter delimiter) {
        if (!delimiter.isDelimiterDefault()) {
            numbers = Delimiter.removeDelimiter(numbers);
        }
        String d = delimiter.getDelimiter();
        List<String> listSplit = customSplit(numbers, d);
        return listSplit.toArray(new String[0]);
    }

    private List<String> customSplit(String numbers, String delimiter) {
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
        List<Integer> negatives = new ArrayList<>();

        for (String num : numbers) {
            int number = Integer.parseInt(num);

            if (number < 0)
            negatives.add(number);
            if(number < 1000)
                sumaRealizada += number;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negatives);
        }

        return sumaRealizada;
    }
}
