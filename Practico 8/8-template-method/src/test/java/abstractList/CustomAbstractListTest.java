package abstractList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.AbstractList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CustomAbstractListTest {

  @Test
  public void customAbstractListSizeTest() {
    AbstractList<Integer> customList = new CustomAbstractList<>(1,2,3);
    assertTrue(customList.size() == 3);
  }

  @Test
  public void AbstractListGetTest() {
    AbstractList<Integer> abstractList = new CustomAbstractList<>(7,8);

    assertEquals(7, abstractList.get(0));
    assertEquals(8, abstractList.get(1));

  }

  @Test
  public void AbstractListGetExceptionTest() {
    AbstractList<Integer> abstractList = new CustomAbstractList<>(7,8);

    assertEquals(7, abstractList.get(0));
    assertEquals(8, abstractList.get(1));

    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      abstractList.get(7);
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,"Index 7 out of bounds for length 2");
  }

  @Test
  public void AbstractListAddExceptionTest() {
    AbstractList<Integer> abstractList = new CustomAbstractList<>(7,8);

    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
      abstractList.add(7);
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,null);
  }

  @Test
  public void AbstractListContainsTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend");
    assertTrue(abstractList.contains("Hello"));
    assertTrue(abstractList.contains("My Friend"));
  }

  @Test
  public void AbstractListRemoveExeptionTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend");
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
      abstractList.remove(0);
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,null);
  }

  @Test
  public void AbstractListIndexOfTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend", "My Friend");

    int index = abstractList.indexOf("My Friend");
    assertEquals(1, index);
  }

  @Test
  public void AbstractListLastIndexOfTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend", "how are you", "My Friend");

    int index = abstractList.lastIndexOf("My Friend");
    assertEquals(3, index);
  }


  @Test
  public void AbstractListClearTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend", "how are you", "My Friend");

    assertEquals(4, abstractList.size());
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
      abstractList.clear();
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,null);

  }

  @Test
  public void AbstractListSubListTest() {
    AbstractList<String> abstractList = new CustomAbstractList<>("Hello", "My Friend", "how are you", "?");
    List<String> sublist = abstractList.subList(1, 3);
    assertEquals(2, sublist.size());
    assertTrue(sublist.get(0).equals("My Friend"));
    assertTrue(sublist.get(1).equals("how are you"));

  }

  @Test
  public void AbstractListEqualsTest() {
    AbstractList<Integer> abstractList = new CustomAbstractList<>(7,8,7,5);
    AbstractList<Integer> abstractList2 = new CustomAbstractList<>(7,8,7,5);
    assertTrue(abstractList.equals(abstractList2));

  }

  @Test
  public void AbstractListRemoveAllTest() {
    AbstractList<Integer> abstractList = new CustomAbstractList<>(7,8,7,5);
    AbstractList<Integer> abstractList2 = new CustomAbstractList<>(7,7);
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
      abstractList.removeAll(abstractList2);
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,null);
  }



}
