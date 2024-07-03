package abstractList;


public class Main {
    public static void main(String[] args) {
        CustomAbstractList<String> customList = new CustomAbstractList<>("One", "Two", "Three", "Four", "Five");

        System.out.println("Elementos de la lista:");
        for (String element : customList) {
            System.out.println(element);
        }

        System.out.println("\nSize de la lista: " + customList.size());

        System.out.println("\nElemento en el indice 2: " + customList.get(2));

        try {
            System.out.println("Elemento en el indice 10: " + customList.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nExcepción al intentar acceder al indice 10: " + e.getMessage());
        }

        Object[] array = customList.toArray();
        System.out.println("\nLista convertida a un array:");
        for (Object element : array) {
            System.out.println(element);
        }

        System.out.println("\nLa lista contiene 'Three': " + customList.contains("Three"));
        System.out.println("La lista contiene 'Ten': " + customList.contains("Ten"));

        System.out.println("\nindice de 'Four': " + customList.indexOf("Four"));
        System.out.println("indice de 'Ten': " + customList.indexOf("Ten"));
    }
}
