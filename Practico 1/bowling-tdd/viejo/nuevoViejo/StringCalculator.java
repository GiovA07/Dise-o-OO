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
        String newDelimiter = delimiter.detectDelimiter(numbers);
        delimiter.set_Delimiter(newDelimiter);
        String[] partNumbers = splitNumbers(numbers, delimiter);
        int addition = additionNumbers(partNumbers);
        return addition;
    }

    private String[] splitNumbers (String numbers, Delimiter delimiter) {
        if (!delimiter.isDelimiterDefault()) {
            numbers = Delimiter.removeDelimiter(numbers);
        }
        String d = delimiter.get_Delimiter();
        return customSplit(numbers, d);
    }

    private String[] customSplit(String str, String delimiter) {
        List<String> parts = new ArrayList<>();
        int delimiterLenght = delimiter.length();

        while (!str.isEmpty()) {
            int delimiterIndex = str.indexOf(delimiter);
            if (delimiterIndex == -1) {
                parts.add(str);
                break;
            }

            String number = str.substring(0, delimiterIndex);
            parts.add(number);
            int indexFinalyDelimiter = delimiterIndex + delimiterLenght;
            str = str.substring(indexFinalyDelimiter, str.length());
        }
        return parts.toArray(new String[0]);
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
