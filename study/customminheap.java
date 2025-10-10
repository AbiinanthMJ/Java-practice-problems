package study;

import java.util.PriorityQueue; // import needed

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (priority " + priority + ")";
    }
}

public class customminheap {
    public static void main(String[] args) {
        // Min-heap based on priority
        PriorityQueue<Task> taskHeap = new PriorityQueue<>(
                (a, b) -> a.priority - b.priority  // smaller priority first
        );

        taskHeap.add(new Task("Write Code", 3));
        taskHeap.add(new Task("Debug", 1));
        taskHeap.add(new Task("Review", 2));

        while (!taskHeap.isEmpty()) {
            System.out.println(taskHeap.poll().name);
        }
        // Output: Debug, Review, Write Code
    }
}
