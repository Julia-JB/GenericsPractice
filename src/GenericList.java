public class GenericList <T> { // Creating a generic class. T is for Type by convention
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item) {
        items[count++] = item;
    }
    public T get(int index) {
        return items[index];
    }

}
