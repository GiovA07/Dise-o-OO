package pizzastore.factoryMethodToAbstactFactory;

public class Main {
  public static void main(String[] args) {
    PizzaStoreFactory factory = new ARGPizzaStore();
    Pizza pizza = factory.createPizzaCheese();
    factory.createOrder(pizza);

    pizza = factory.createPizzaVeggie();
    factory.createOrder(pizza);
  }
}
