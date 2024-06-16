package adapter.list;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CustomeListTest {

  @Test
  public void addElementAndSizeTest() {
    CustomeList<Integer> list = new CustomeList<>();
    list.addElement(1);
    list.addElement(2);
    list.addElement(3);

    assertTrue(list.getSize() == 3);
  }

  @Test
  public void getElementTest() {
    CustomeList<String> list = new CustomeList<>();
    list.addElement("Hi");
    list.addElement("how are you");
    list.addElement("?");


    String msg = list.getElement(0);
    assertTrue(msg.equals("Hi"));

    msg = list.getElement(1);
    assertTrue(msg.equals("how are you"));

    msg = list.getElement(2);
    assertTrue(msg.equals("?"));

  }

  @Test
  public void getElementExeptionTest() {
    CustomeList<String> list = new CustomeList<>();
    list.addElement("Hi");
    list.addElement("how are you");
    list.addElement("?");

    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      list.getElement(3);
    });
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains("Index: 3, Size: 3"));
  }

  @Test
  public void removeElement() {
    CustomeList<String> list = new CustomeList<>();
    list.addElement("Hi");
    list.addElement("how are you");
    list.addElement("?");

    String element = list.removeElement(1);
    assertTrue(element.equals("how are you"));
    assertTrue(list.getSize() == 2);

    String msg = list.getElement(0);
    assertTrue(msg.equals("Hi"));

    msg = list.getElement(1);
    assertTrue(msg.equals("?"));
  }

  @Test
  public void removeElementExceptionTest() {
    CustomeList<String> list = new CustomeList<>();
    list.addElement("Hi");
    list.addElement("how are you");
    list.addElement("?");

    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
      list.removeElement(3);
    });

    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains("Index: 3, Size: 3"));
  }
}
