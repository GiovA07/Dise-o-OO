package pizzastore.factoryMethodToAbstactFactory;

public class ARGStyleVeggiePizza extends Pizza {
  public ARGStyleVeggiePizza() {
		name = "Argentina Style Vegetable Pizza";
		dough = "Thin Crust Dough";
		sauce = "Tomato Basil Sauce";

		toppings.add("Shredded Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Bell Peppers");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
