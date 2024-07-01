package remotecontrol.textedit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor buffer = new TextEditor();
        AdminCommands commandManager = new AdminCommands();

        while (true) {
            System.out.println("Comandos: 1 - Add \n 2 - Remove \n 3 - Print \n 4 - Undo \n 5 - Redo \n Ingresa: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.println("Ingresa el texto:");
                    String line = scanner.nextLine();
                    System.out.println("Ingresa el index:");
                    int addIndex = scanner.nextInt();
                    commandManager.executeCommand(new AddLineCommand(buffer, line, addIndex));
                    break;
                case 2:
                    System.out.println("Index de la linea que queres borrar:");
                    int removeIndex = scanner.nextInt();
                    commandManager.executeCommand(new DeleteLineCommand(buffer, removeIndex));
                    break;
                case 3:
                    commandManager.executeCommand(new PrintCommand(buffer));
                    break;
                case 4:
                    commandManager.undo();
                    break;
                case 5:
                    commandManager.redo();
                    break;
                default:
                    scanner.close();
                    return;
            }
        }
    }
}
