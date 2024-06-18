package pizzastore.factorymethod;

public class ARGStyleClamPizza extends Pizza{

    public ARGStyleClamPizza() {
		name = "Argentina Style Seafood Pizza";
		dough = "Thick Crust Dough";
		sauce = "Tomato Sauce";

		toppings.add("Grated Mozzarella Cheese");
		toppings.add("Fresh Clams");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
