import factorys.FactoryClassic;
import factorys.InterfazFactoryVersion;

public class Main {
    public static void main(String[] args) {
        InterfazFactoryVersion factory = new FactoryClassic();
        Cliente cliente = new Cliente(factory);
        cliente.createEntity("wizard", "Giova");
        cliente.createEntity("knight", "Giova2");

        cliente.changeWeapon("Giova2", "sword");
        cliente.addGem("Giova2", "ruby");
        cliente.addGem("Giova2", "ruby");

        cliente.addObserver("terminal");

        cliente.startBattle("Giova", "Giova2");

    }
}
