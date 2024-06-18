package pizzastore.factorymethod;

public class ARGStyleCheesePizza extends Pizza{
  public ARGStyleCheesePizza() {
    	name = "Argentina Style Thick Crust Cheese Pizza";
    	dough = "Thick Crust Dough";
    	sauce = "Tomato Sauce";

		toppings.add("Grated Mozzarella Cheese");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
