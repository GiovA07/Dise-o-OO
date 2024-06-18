package abstractList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.AbstractList;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AbstractListTest {
  @Test
  public void AbstractListAddSizeest() {
    AbstractList<Integer> abstractList = new ArrayList<>();
    abstractList.add(2);

    assertTrue(abstractList.size() == 1);
  }

  @Test
  public void AbstractListGetTest() {
    AbstractList<Integer> abstractList = new ArrayList<>();
    abstractList.add(7);
    abstractList.add(8);

    assertEquals(7, abstractList.get(0));
    assertEquals(8, abstractList.get(1));

  }

  @Test
  public void AbstractListGetExceptionTest() {
    AbstractList<Integer> abstractList = new ArrayList<>();
    abstractList.add(7);
    abstractList.add(8);

    assertEquals(7, abstractList.get(0));
    assertEquals(8, abstractList.get(1));

    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      abstractList.get(7);
    });
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage,"Index 7 out of bounds for length 2");
  }

  @Test
  public void AbstractListContainsTest() {
    AbstractList<String> abstractList = new ArrayList<>();
    abstractList.add("Hello");
    abstractList.add("My Friend");
    assertTrue(abstractList.contains("Hello"));
    assertTrue(abstractList.contains("My Friend"));
  }

  @Test
  public void AbstractListRemoveTest() {
    AbstractList<String> abstractList = new ArrayList<>();
    abstractList.add("Hello");
    abstractList.add("My Friend");
    abstractList.remove(0);
    assertTrue(abstractList.contains("My Friend"));
    abstractList.remove(0);
    assertTrue(abstractList.isEmpty());
  }

  @Test
  public void AbstractListIndexOfTest() {
    AbstractList<String> abstractList = new ArrayList<>();
    abstractList.add("Hello");
    abstractList.add("My Friend");
    abstractList.add("My Friend");

    int index = abstractList.indexOf("My Friend");
    assertEquals(1, index);
  }

  @Test
  public void AbstractListLastIndexOfTest() {
    AbstractList<String> abstractList = new ArrayList<>();
    abstractList.add("Hello");
    abstractList.add("My Friend");
    abstractList.add("how are you");
    abstractList.add("My Friend");

    int index = abstractList.lastIndexOf("My Friend");
    assertEquals(3, index);
  }


  @Test
  public void AbstractListClearTest() {
    AbstractList<String> abstractList = new ArrayList<>();
    abstractList.add("Hello");
    abstractList.add("My Friend");
    abstractList.add("how are you");
    abstractList.add("My Friend");

    assertEquals(4, abstractList.size());

    abstractList.clear();
    assertEquals(0, abstractList.size());

  }

  @Test
  public void AbstractListRemoveAllTest() {
    AbstractList<Integer> abstractList = new ArrayList<>();
    abstractList.add(8);
    abstractList.add(7);
    abstractList.add(7);
    abstractList.add(5);

    AbstractList<Integer> abstractList2 = new ArrayList<>();
    abstractList2.add(7);
    abstractList2.add(5);

    abstractList.removeAll(abstractList2);

    assertTrue(abstractList.size() == 1);
    assertTrue(abstractList.contains(8));

  }
}
