package adapter.list;


public class CustomeList <E> {

    private int size;
    private E[] array;

    @SuppressWarnings("unchecked")
    public CustomeList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public void addElement(E elem) {
        if (size == array.length) {
            E[] newArray = (E[]) new Object[array.length+1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[size] = elem;
            array = newArray;
        } else {
            array[size] = elem;
        }
        size++;
    }

    public E removeElement(int id) {
        if(id < 0 || id >= size)
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);

        E elem = array[id];
        for (int i = id; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return elem;
    }

    public int getSize() {
        return size;
    }

    public E getElement(int id) {
        if(id < 0 || id >= size)
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);

        return array[id];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
