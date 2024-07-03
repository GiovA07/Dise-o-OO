package remotecontrol.texteditnew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactoryCommand factory = new FactoryTextCommand();
        AdminCommands admin = new AdminCommands(factory);
        Text buffer = new Text();

        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        while (bool) {
            System.out.println("Comandos: 1 - Add \n 2 - Remove \n 3 - Print \n 4 - Undo \n 5 - Redo \n 6 - addWord \n 7- deleteWord \n Ingresa: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1 || command == 2 || command == 3 || command == 6 || command == 7) {
                admin.executeCommand(command, buffer);
            } else if (command == 4) {
                admin.undo();
            } else if (command == 5) {
                admin.undo();
            } else {
                bool = false;
            }
        }

        scanner.close();

    }
}
