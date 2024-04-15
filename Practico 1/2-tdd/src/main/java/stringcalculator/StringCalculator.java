package stringcalculator;

import java.util.List;
// import output.webService.IWebService;

import Logger.ILogger;

import java.util.ArrayList;

public class StringCalculator {

    private Delimiter delimiter = new Delimiter();
    private ILogger logger;
    // private IWebService webService;

    public StringCalculator(ILogger logger) {
        this.logger = logger;
        // this.webService = webService;
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            logger.write("Sum result: " + 0);
            return 0;
        }

        if (Delimiter.hasDelimiterCustom(numbers)) {
            List<String> newDelimtiers = delimiter.extractDelimiters(numbers);
            delimiter.addDelimiters(newDelimtiers);
            numbers = Delimiter.removeDelimiter(numbers);
        }

        List<String> numberParts = split(numbers);
        int addition = additionNumbers(numberParts);

        // Log the sum result
        logger.write("Sum result: " + addition);
        return addition;
    }

    public List<String> split(String stringNumbers) {
        List<String> numberList = new ArrayList<>();
        List<String> delimiterList = delimiter.getDelimiter();
        int turn = 1;
        while (!stringNumbers.isEmpty()) {
            if (turn == 1) {
                String numStr = getNumber(stringNumbers);
                numberList.add(numStr);
                stringNumbers = takeNumber(stringNumbers, numStr);
                turn = 2;
            } else {
                String delimiterStr = getDelimiter(stringNumbers);
                if (!delimiterList.contains(delimiterStr)) {
                    //throw new Exception("La cadena tenía un delimitador que no existe");
                }
                stringNumbers = takeDelimiter(stringNumbers, delimiterStr);
                turn = 1;
            }
        }
        return numberList;
    }

    public static String getDelimiter (String stringNumbers) {
        StringBuilder delimiterStr = new StringBuilder();
        int indexStr = 0;
        while (indexStr < stringNumbers.length()) {
            char c = stringNumbers.charAt(indexStr);
            if (!isNumber(c)) {
                delimiterStr.append(c);
                indexStr += 1;
            } else {
                break;
            }
        }
        return delimiterStr.toString();
    }

    public static String getNumber (String stringNumbers) {
        StringBuilder numberStrBuilder = new StringBuilder();

        for (int indexStr = 0; indexStr < stringNumbers.length(); indexStr++) {
            char c = stringNumbers.charAt(indexStr);
            if (isNumber(c)) {
                numberStrBuilder.append(c);
            } else {
                break; // Salimos del bucle si encontramos un carácter que no es un número
            }
        }
        return numberStrBuilder.toString();
    }


    public static boolean isNumber (char c) {
        return (c >= '0' && c <= '9') || c == '-' ;
    }

    public static String takeNumber(String stringNumbers, String number) {
        int lengthNumber = number.length();
        return stringNumbers.substring(lengthNumber);
    }

    public static String takeDelimiter(String stringNumbers, String delimiter) {
        int lengthDelimiter = delimiter.length();
        return stringNumbers.substring(lengthDelimiter);
    }

    private static int additionNumbers(List<String> numbers) {
        int sumaRealizada = 0;
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            sumaRealizada += number;
        }
        return sumaRealizada;
    }
}
