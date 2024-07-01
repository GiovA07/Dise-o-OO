package barista;

public class NewSpecial extends CaffeineBeverage{

    String particularity = "";

    void brew() {
        particularity = "Secret stract of Cheese";
        System.out.println("Secret stract of Cheese");
    }

    void addCondiments() {
        particularity += ", Adding special marine sugar";
        System.out.println("Adding special marine sugar");
    }

    public String getParticularity() {
        return particularity;
    }
}
