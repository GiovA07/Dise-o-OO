package barista;

public class BeverageTestDrive {
	public static void main(String[] args) {

		Tea tea = new Tea();
		Coffee coffee = new Coffee();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();


		BlackCoffee blackCoffee = new BlackCoffee();
		System.out.println("\nMaking Black Coffee...");
		blackCoffee.prepareRecipe();
	}
}
