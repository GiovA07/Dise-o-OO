package pizzastore.factorymethod;

public class ARGStyleCheesePizza extends Pizza{
  public ARGStyleCheesePizza() {
		name = "Argentina Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
