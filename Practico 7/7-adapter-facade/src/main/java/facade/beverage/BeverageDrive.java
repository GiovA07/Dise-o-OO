package facade.beverage;

public class BeverageDrive {

    public static void main(String[] args) {
        BeverageFactory factory = new BeverageFactory();
        BeverageMacchine macchine = new BeverageMacchine(factory);

        Beverage beverage = macchine.prepareBeverage("Classic Coff-SMALL-Mocha,Milk,Sugar");
        System.out.println(beverage.getDescription());
    }
}
