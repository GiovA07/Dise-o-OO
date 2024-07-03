package pizzastore.factorymethod;

public class Client {
    PizzaStore store;

    public Client(PizzaStore store) {
        this.store = store;
    }

    public void Order(String orderPizzas) {
        String[] strPizzas = orderPizzas.split(",");

        for (String typePizza : strPizzas) {
            store.orderPizza(typePizza);
        }

    }


    public static void main(String[] args) {
        PizzaStore store = new ARGPizzaStore();
        Client client = new Client(store);

        client.Order("veggie,cheese,cheese,veggie,clam");
    }
}
