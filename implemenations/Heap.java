package implementations;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public Heap() {
        list = new ArrayList<>();
    }
    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
    private int parent(int i) {
        return (i - 1) / 2;// manual indexing of the ArrayList
    }
    private int left(int i) {
        return 2 * i + 1;// manual indexing of the ArrayList
    }
    private int right(int i) {
        return 2 * i + 2;// manual indexing of the ArrayList
    }
    // 🔹 Insert into heap (min-heap)
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);   // instead of inline bubble-up
    }
    private void upHeap(int i) {
        while (i > 0 && list.get(i).compareTo(list.get(parent(i))) < 0) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public T peek() {
        if (list.isEmpty()) return null;
        return list.get(0);
    }

    public T remove() {
        if (list.isEmpty()) return null;

        T root = list.get(0);

        // Move last element to root
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }

        return root;
    }

    // 🔹 Bubble-down (restore heap after removal)
    private void downHeap(int i) {
        while (true) {
            int leftIndex = left(i);
            int rightIndex = right(i);
            int smallest = i;

            if (leftIndex < list.size() &&
                    list.get(leftIndex).compareTo(list.get(smallest)) < 0) {
                    smallest = leftIndex;
            }
            if (rightIndex < list.size() &&
                    list.get(rightIndex).compareTo(list.get(smallest)) < 0) {
                    smallest = rightIndex;
            }

            if (smallest != i) {
                swap(i, smallest);
                i = smallest; // keep going down
            } else {
                break; // heap property restored
            }
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printHeap() {
        System.out.println(list);
    }

    // ✅ quick test
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        heap.insert(7);
        heap.insert(3);
        heap.insert(10);
        heap.insert(1);
        heap.insert(5);
        heap.insert(2);

        heap.printHeap(); // prints internal array

        System.out.println("Peek: " + heap.peek()); // should be 1

        while (!heap.isEmpty()) {
            System.out.print(heap.remove() + " "); // should print sorted order
        }
    }
}
