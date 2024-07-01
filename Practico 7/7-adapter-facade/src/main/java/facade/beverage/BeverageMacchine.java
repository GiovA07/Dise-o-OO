package facade.beverage;


public class BeverageMacchine {

    String condiments = "";
    BeverageFactory factory;

    public BeverageMacchine(BeverageFactory factory) {

        this.factory = factory;

    }

    public Beverage prepareBeverage(String orden) {

        String[] elements = orden.split("-");
        String drink = elements[0];
        String size = elements[1];
        condiments = elements[2];
        Beverage beverage = factory.createBeverage(drink, Size.fromString(size), condiments);

        return beverage;
    }

    public String getCondiments() {
        return condiments;
    }

}
