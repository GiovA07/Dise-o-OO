package pizzastore.factoryMethodToAbstactFactory;

public class ARGPizzaStore extends PizzaStoreFactory {

	@Override
	public Pizza createPizzaCheese() {
		return new ARGStyleCheesePizza();

	}

	@Override
	public Pizza createPizzaVeggie() {
		 return new ARGStyleVeggiePizza();
	}

	@Override
	Pizza createPizzaClam() {
		return new ARGStyleClamPizza();
	}

}
