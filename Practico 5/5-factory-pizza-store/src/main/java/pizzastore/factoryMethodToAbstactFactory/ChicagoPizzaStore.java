package pizzastore.factoryMethodToAbstactFactory;

public class ChicagoPizzaStore extends PizzaStoreFactory {

	@Override
	public Pizza createPizzaCheese() {
		return new ChicagoStyleCheesePizza();
	}

	@Override
	public Pizza createPizzaClam() {
		return new ChicagoStyleVeggiePizza();
	}

	@Override
	public Pizza createPizzaVeggie() {
		return new ChicagoStyleClamPizza();
	}
}
