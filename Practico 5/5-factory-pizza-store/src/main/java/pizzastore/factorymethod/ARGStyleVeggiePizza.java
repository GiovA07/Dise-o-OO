package pizzastore.factorymethod;

public class ARGStyleVeggiePizza extends Pizza {
  public ARGStyleVeggiePizza() {
		name = "Argentina Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
