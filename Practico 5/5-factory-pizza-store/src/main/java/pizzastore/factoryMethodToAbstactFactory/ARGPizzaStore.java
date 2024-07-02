package pizzastore.factoryMethodToAbstactFactory;

public class ARGPizzaStore implements FactoryPizza {
	@Override
	public Pizza createTypePizza(String type) {
		if(type.equals("cheese")) {
			return new ARGStyleCheesePizza();
		} else if (type.equals("clam")) {
			return new ARGStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new ARGStyleVeggiePizza();
		} else {
			throw new IllegalArgumentException("type pizza invalid");
		}
	}
}
