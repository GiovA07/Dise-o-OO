package pizzastore.factoryMethodToAbstactFactory;

public abstract class PizzaStoreFactory {

	abstract Pizza createPizzaCheese();
	abstract Pizza createPizzaVeggie();
	abstract Pizza createPizzaClam();


	public Pizza createTypePizza(String type) {
		if(type.equals("cheese")) {
			return createPizzaCheese();
		} else if (type.equals("veggie")){
			return createPizzaVeggie();
		} else if (type.equals("clam")) {
			return createPizzaClam();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
