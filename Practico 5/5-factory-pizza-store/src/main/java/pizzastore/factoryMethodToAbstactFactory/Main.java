package pizzastore.factoryMethodToAbstactFactory;

public class Main {
  public static void main(String[] args) {
    PizzaStoreFactory factory = new ARGPizzaStore();
    OrderPizza order = new OrderPizza(factory);
    order.createOrder("cheese");

    PizzaStoreFactory factoryChicago = new ChicagoPizzaStore();
    OrderPizza orderChicago = new OrderPizza(factoryChicago);
    orderChicago.createOrder("clam");

  }
}
