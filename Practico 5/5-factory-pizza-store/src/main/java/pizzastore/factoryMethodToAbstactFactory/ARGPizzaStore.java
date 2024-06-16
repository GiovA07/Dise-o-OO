package pizzastore.factoryMethodToAbstactFactory;

public class ARGPizzaStore extends PizzaStoreFactory {

	@Override
	public Pizza createPizzaCheese() {
		Pizza pizza = createOrder(new ARGStyleCheesePizza());
		return pizza;
	}

	@Override
	public Pizza createPizzaPeperoni() {
	// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza createPizzaVeggie() {
		Pizza pizza = createOrder(new ARGStyleVeggiePizza());
		return pizza;
	}

}
