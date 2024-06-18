package pizzastore.factoryMethodToAbstactFactory;

public abstract class PizzaStoreFactory {

	abstract Pizza createPizzaCheese();
	abstract Pizza createPizzaVeggie();
	abstract Pizza createPizzaClam();

	protected Pizza createOrder(Pizza pizza) {
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
