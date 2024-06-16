package pizzastore.factoryMethodToAbstactFactory;

public class Main {
  public static void main(String[] args) {
    PizzaStoreFactory factory = new ARGPizzaStore();
    Pizza pizza = factory.createPizzaCheese();
    pizza = factory.createPizzaVeggie();
  }
}
