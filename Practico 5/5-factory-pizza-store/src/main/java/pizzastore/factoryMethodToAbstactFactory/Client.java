package pizzastore.factoryMethodToAbstactFactory;

public class Client {
    PizzaStore store;

    public Client(String store) {
        FactoryPizza factory = typeStore(store);
        this.store = new PizzaStore(factory);
    }

    public void Order(String orderPizzas) {
        String[] strPizzas = orderPizzas.split(",");

        for (String typePizza : strPizzas) {
            store.createOrder(typePizza);
        }

    }

    private FactoryPizza typeStore (String type) {
        if(type.equals("Argentina")) {
            return new ARGPizzaStore();
        } else if (type.equals("Chicago")) {
            return new ChicagoPizzaStore();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
