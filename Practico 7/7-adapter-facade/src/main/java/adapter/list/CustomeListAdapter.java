package adapter.list;


import java.util.*;


public class CustomeListAdapter<E> implements List<E>{

    private CustomeList<E> customeList;

    public CustomeListAdapter(CustomeList<E> list) {
        this.customeList = list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(Object e) {
        customeList.addElement((E) e);
        return true;
    }

    @Override
    public E remove(int index) {
        return customeList.removeElement(index);
    }

    @Override
    public int size() {
        return customeList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return customeList.isEmpty();
    }

    @Override
    public E get(int index) {
        return customeList.getElement(index);
    }






    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}
