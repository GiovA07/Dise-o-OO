package barista;

public class BlackCoffee extends CaffeineBeverage{

    String change = "";

    void brew() {
        change = "Dripping black coffee through filter";
        System.out.println(change);
    }

    void addCondiments() { }

    public String getChanges() {
        return change;
    }

    public boolean addIt() {
        return false;
    }
}
