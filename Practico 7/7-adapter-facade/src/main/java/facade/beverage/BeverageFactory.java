package facade.beverage;

public class BeverageFactory {

    public Beverage createBeverage(String type, Size size, String ingredients) {
        Beverage bebida;
        if (type.equals("Classic Coff")) {
            bebida = new Clasic(size);
        } else if (type.equals("Dark Coff")) {
            bebida = new DarkRoast(size);
        } else if (type.equals("Expresso")) {
            bebida = new Espresso(size);
        } else if (type.equals("Decaf Coff")) {
            bebida = new Decaf(size);
        } else if (type.equals("House Blend")) {
            bebida = new HouseBlend(size);
        } else 
            throw new IllegalArgumentException("Tipo de bebida incexistente");
        
        return addIngredients(ingredients, bebida);
    }

    private Beverage addIngredients(String ingredients, Beverage bebida) {
        
        String[] listOfIngredients = ingredients.split(",");

        for (String string : listOfIngredients) {
            if (string.equals("Mocha"))
                bebida = new Mocha(bebida);
            else if (string.equals("Milk"))
                bebida = new Milk(bebida);
            else if (string.equals("Soy"))
                bebida = new Soy(bebida);
            else if (string.equals("Sugar"))
                bebida = new Sugar(bebida);
            else if (string.equals("Whip"))
                bebida = new Whip(bebida);
            else 
                throw new IllegalArgumentException("Condimento ingresado invalido");
        }

        return bebida;
    }
}
