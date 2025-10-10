package problems;
import java.util.*;
public class D80 {
    public static void main(String[] args) {
        int A[] = {2,7,4,1,8,1};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : A)
            pq.offer(a);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        System.out.println(pq.poll());
    }
}
