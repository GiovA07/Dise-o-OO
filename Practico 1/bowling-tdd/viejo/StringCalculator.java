package stringcalculator;

import java.util.List;
import java.util.ArrayList;

public class StringCalculator {

    public static int add (String numbers) {
        if (numbers.isEmpty())
            return 0;

        Delimiter delimiter = new Delimiter();
        String[] partNumbers = splitNumbers(numbers, delimiter);
        int addition = additionNumbers(partNumbers);
        return addition;
    }

    private static String[] splitNumbers (String numbers, Delimiter delimiter) {
        if (Delimiter.stringHasDelimiter(numbers)) {
            String newDelimiter = Delimiter.extractDelimiter(numbers);
            delimiter.set_Delimiter(newDelimiter);
            numbers = removeDelimiter(numbers);
        }
        String delimiterStr = delimiter.get_Delimiter();
        return numbers.split(delimiterStr);
    }

    private static String removeDelimiter(String numbers) {
        int index = numbers.indexOf('\n');

        if (index != -1)
            numbers = numbers.substring(index + 1);

        return numbers;
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
