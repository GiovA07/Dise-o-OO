package adapter.list;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        CustomeList<Integer> list = new CustomeList<>();
        List<Integer> listAdapter = new CustomeListAdapter<>(list);

        listAdapter.add(7);
        listAdapter.add(77);
        listAdapter.add(777);
        listAdapter.add(7777);
        listAdapter.add(77777);

        System.out.println("El Tamaño es: " + listAdapter.size());

        System.out.println("La Lista es: ");
        for (int i = 0; i< listAdapter.size() ; i++) {
            System.out.println(listAdapter.get(i));
        }

        Integer num = listAdapter.get(3);
        System.out.println("El numero en el index 3 es: "+num);
        num = listAdapter.remove(1);
        System.out.println("El numero eliminado en la posicion 1 es: " + num);
        System.out.println("La Lista quedo de la siguiente manera: ");
        for (int i = 0; i< listAdapter.size() ; i++) {
            System.out.println(listAdapter.get(i));
        }
    }
}
