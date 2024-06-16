package adapter.list;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


public class CustomeListAdapterTest {

  @Test
  public void addElementListTest() {
    CustomeList<Integer> list = new CustomeList<>();
    List<Integer> listAdapter = new CustomeListAdapter<Integer>(list);

    listAdapter.add(1);
    listAdapter.add(2);
    listAdapter.add(3);

    assertTrue(listAdapter.size() == 3);
  }

  @Test
  public void getElementTest() {
    CustomeList<String> list = new CustomeList<>();
    List<String> listAdapter = new CustomeListAdapter<>(list);
    listAdapter.add("Hi");
    listAdapter.add("how are you");
    listAdapter.add("?");


    String msg = listAdapter.get(0);
    assertTrue(msg.equals("Hi"));

    msg = listAdapter.get(1);
    assertTrue(msg.equals("how are you"));

    msg = listAdapter.get(2);
    assertTrue(msg.equals("?"));

  }


  @Test
  public void getElementExeptionTest() {
    CustomeList<String> list = new CustomeList<>();
    List<String> listAdapter = new CustomeListAdapter<>(list);
    listAdapter.add("Hi");
    listAdapter.add("how are you");
    listAdapter.add("?");

    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      listAdapter.get(3);
    });
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains("Index: 3, Size: 3"));
  }

  @Test
  public void removeElement() {
    CustomeList<Character> list = new CustomeList<>();
    List<Character> listAdapter = new CustomeListAdapter<>(list);
    listAdapter.add('H');
    listAdapter.add('E');
    listAdapter.add('L');
    listAdapter.add('L');
    listAdapter.add('O');

    Character element = listAdapter.remove(1);
    assertTrue(element.equals('E'));
    assertTrue(list.getSize() == 4);

    Character elem = listAdapter.get(0);
    assertTrue(elem.equals('H'));

    elem = listAdapter.get(1);
    assertTrue(elem.equals('L'));

    elem = listAdapter.get(2);
    assertTrue(elem.equals('L'));

    elem = listAdapter.get(3);
    assertTrue(elem.equals('O'));
  }

  @Test
  public void listToListTest() {
    CustomeList<List<Integer>> list = new CustomeList<>();
    List<List<Integer>> listAdapter = new CustomeListAdapter<>(list);

    CustomeList<Integer> subList = new CustomeList<>();
    subList.addElement(1);
    subList.addElement(2);
    subList.addElement(3);;
    List<Integer> adapterSubList1 = new CustomeListAdapter<>(subList);

    listAdapter.add(adapterSubList1);

    CustomeList<Integer> subList2 = new CustomeList<>();
    subList2.addElement(4);
    subList2.addElement(5);
    subList2.addElement(5);;
    List<Integer> adapterSubList2 = new CustomeListAdapter<>(subList2);

    listAdapter.add(adapterSubList2);

    List<Integer> auxList = listAdapter.get(0);
    assertTrue(auxList.get(0) == 1);
    assertTrue(auxList.get(1) == 2);
    assertTrue(auxList.get(2) == 3);

    auxList = listAdapter.get(1);
    assertTrue(auxList.get(0) == 4);
    assertTrue(auxList.get(1) == 5);
    assertTrue(auxList.get(2) == 5);
  }
}
