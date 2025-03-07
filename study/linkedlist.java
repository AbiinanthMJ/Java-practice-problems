package study;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        LinkedList<Integer> llw = new LinkedList<>();
        List arr = new LinkedList();
        arr.add(Integer.valueOf(1));
        arr.add("Abiinanth");
        arr.addFirst(-20);
        arr.addLast(20);
        System.out.println(arr);
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
//      for(Integer x : arr){
//         System.out.println(x);
//      }
        Iterator it = arr.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        ________________________________________________________________________
//        see in linked list there is also a method called offer , offerfirst , offerlast
//        this basically where there is need to handle exception and throw a error based on our own opinion
//        -------------------------------------------------------------------------
//        today it is enough ..............take some rest 😷

    }
}
