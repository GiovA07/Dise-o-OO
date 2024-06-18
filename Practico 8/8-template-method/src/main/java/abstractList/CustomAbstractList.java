package abstractList;

import java.util.AbstractList;

public class CustomAbstractList<E> extends AbstractList<E> {
  private int size;
  private E[] array;

  @SuppressWarnings("unchecked")
  public CustomAbstractList(E... element) {
    size = element.length;
    array = (E[]) new Object[size];

    int i = 0;
    for(E elem: element) {
      array[i] = elem;
      i++;
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public E get(int id) {
    if(id < 0 || id >= size)
        throw new IndexOutOfBoundsException("Index " + id + " out of bounds for length " + size);

    return array[id];
  }
}
