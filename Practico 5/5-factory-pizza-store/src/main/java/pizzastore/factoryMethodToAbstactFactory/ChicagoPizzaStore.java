package pizzastore.factoryMethodToAbstactFactory;

public class ChicagoPizzaStore implements FactoryPizza {

	@Override
	public Pizza createTypePizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else {
			throw new IllegalArgumentException("type pizza invalid");
		}
	}
}
