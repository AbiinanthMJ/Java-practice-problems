package study;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
public class D51 {
    public static void main(String[] args) {
        //        min stores the min value at the top of the stack table in a order
        //    it allows the duplicate value in the heap to store
        //    max heap stores the max value in the top of the heap and it uses the collections.reverse order to make the min heap to max heap
//        PriorityQueue<Integer> minheap_pq = new PriorityQueue<>();
//        PriorityQueue<Integer> maxheap_pq = new PriorityQueue<>(Collections.reverseOrder());
//        minheap_pq.add(10);
//        minheap_pq.add(5);
//        minheap_pq.add(20);
//        Iterator it = minheap_pq.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        String s="Abiinanth";
        System.out.print(s.length());
    }
}
