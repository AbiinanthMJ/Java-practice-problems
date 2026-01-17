package oops.ArrayList;

import java.util.Arrays;

public class  ArrayListt<T> {
    private Object[] AOD;     // Use Object[] since Java doesn't allow generic array creation
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public ArrayListt() {
        this.AOD = new Object[DEFAULT_SIZE];
    }

    // Add element
    public void add(T element) {
        if (isFull()) {
            resize();
        }
        AOD[size++] = element;
    }
    public T remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty, cannot remove");
        }
        T removed = (T) AOD[--size];
        AOD[size] = null; // clear reference for GC
        return removed;
    }

    // Set value at index
    public void set(int index, T value) {
        checkIndex(index);
        AOD[index] = value;
    }
    // Get value at index
    public T get(int index) {
        checkIndex(index);
        return (T) AOD[index];
    }

    // Resize when full
    private void resize() {

        Object[] tempArray = new Object[AOD.length * 2];
        for (int i = 0; i < AOD.length; i++) {
            tempArray[i] = AOD[i];
        }
        AOD = tempArray;
        DEFAULT_SIZE = DEFAULT_SIZE * 2;
    }

    private int size() {
        return this.size;
    }

    private boolean isFull() {
        return size == AOD.length;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList { " +
                "data = " + Arrays.toString(Arrays.copyOf(AOD, size)) +
                ", size = " + size +
                " }";
    }
}
