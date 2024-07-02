package pizzastore.factoryMethodToAbstactFactory;

public class Main {
  public static void main(String[] args) {
    Client client = new Client("Argentina");

    client.Order("cheese,clam,cheese,veggie,clam,clam");


    client = new Client("Chicago");
    client.Order("cheese,clam,cheese,veggie,clam,clam");

  }
}
