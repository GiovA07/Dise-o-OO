package pizzastore.abstractfactory.Argentina;

import pizzastore.abstractfactory.*;

public class ArgentinaPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ArgentinaDough();
	}

	public Sauce createSauce() {
		return new CriollaSauce();
	}

	public Cheese createCheese() {
		return new CreamCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new TomatoVeggie(),
		                      new GreenOlives(),
		          					 };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
