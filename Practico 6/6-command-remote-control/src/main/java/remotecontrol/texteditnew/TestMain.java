package remotecontrol.texteditnew;

public class TestMain {
        public static void main(String[] args) {
            FactoryCommand factory = new FactoryTextCommand();
            AdminCommands admin = new AdminCommands(factory);
            Text buffer = new Text();

            admin.executeCommand(1, buffer); // Agregar
            admin.executeCommand(6, buffer); // Añadir palabra
            admin.undo(); // Deshacer el añadir palabra
            admin.executeCommand(3, buffer); // Imprimir
            admin.executeCommand(7, buffer); // Eliminar palabra
            admin.executeCommand(3, buffer); // Imprimir
            admin.executeCommand(2, buffer); // Remover linea
            admin.executeCommand(3, buffer); // Imprimir
            admin.undo(); // Deshacer el remover linea
            admin.executeCommand(3, buffer); // Imprimir
            admin.redo(); // Rehacer el remover linea

        }
}
