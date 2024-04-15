package input;

import java.util.Scanner;
import Logger.ILogger;
import Logger.Log;
import stringcalculator.StringCalculator;

public class Main {
  public static void main(String[] args) {
    ILogger logger = new Log();
    StringCalculator lol = new StringCalculator(logger);
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.print("Ingrese una cadena de numeros (o presione Enter para salir): ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
          exit = true;
        } else {
          int result = lol.add(input);
          System.out.println("El resultado es " + result);
          System.out.println("Otra entrada, por favor.");
        }
      }

      scanner.close();
  }
}


