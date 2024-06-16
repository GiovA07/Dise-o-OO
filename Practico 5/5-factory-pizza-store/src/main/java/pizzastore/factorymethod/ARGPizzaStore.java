package pizzastore.factorymethod;

public class ARGPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ARGStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ARGStyleVeggiePizza();
        	} else return null;
	}

}
