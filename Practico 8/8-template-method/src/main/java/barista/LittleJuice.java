package barista;

public class LittleJuice extends CaffeineBeverage{

    String drinkSpecification = "";

    void brew() {
        drinkSpecification = "Squeeze orange";
        System.out.println(drinkSpecification);
    }

    void addCondiments() {
        drinkSpecification += ", Adding sugar and lemon";
        System.out.println("Adding sugar and lemon");
    }

    public String getSpecification(){
        return drinkSpecification;
    }
}
