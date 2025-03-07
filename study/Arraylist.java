package study;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist {
//   i am going to take a break i am tried so badly tommorow i will start linked list
   public static void main(String[] args) {
      List arr = new ArrayList<>();
      arr.add(Integer.valueOf(1));
      arr.add("Abiinanth");
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
   }

}
