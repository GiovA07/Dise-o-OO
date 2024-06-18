package barista;

public class Soda extends CaffeineBeverage {

    String speciality = "";

    void brew() {
        speciality = "Filling the soda bottle with soda water";
        System.out.println(speciality);
    }

    void addCondiments() {
        speciality += ", Adding coloring, Na, things";
        System.out.println("Adding coloring, Na, things");
    }

    public String getSpeciality() {
        return speciality;
    }

	public boolean addIt() {
		return true;
	}
}
