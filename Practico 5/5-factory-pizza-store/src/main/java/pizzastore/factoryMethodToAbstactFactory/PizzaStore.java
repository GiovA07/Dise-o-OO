package pizzastore.factoryMethodToAbstactFactory;

public class PizzaStore {
    public FactoryPizza factory;

    public PizzaStore(FactoryPizza factory) {
        this.factory = factory;
    }

    public Pizza createOrder(String type) {
        Pizza pizza = factory.createTypePizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
