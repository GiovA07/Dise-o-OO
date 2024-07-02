public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.createEntity("wizard", "Giova");
        cliente.createEntity("knight", "Giova2");
        cliente.addObserver("terminal");

        cliente.startBattle("Giova", "Giova2");

    }
}
