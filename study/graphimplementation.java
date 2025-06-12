package study;
import java.util.*;
class graph{
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    graph(int v){
      for(int i=0;i<v;i++){
          list.add(new ArrayList<Integer>());
      }
    }
    public void addedge(int u,int v){
       list.get(u).add(v);
       list.get(v).add(u);
    }
    public void display(){
       for(int i=0;i<list.size();i++){
           System.out.println("LIST NUMBER"+i);
           for(int j=0;j<list.get(i).size();j++){
               System.out.print(list.get(i).get(j));
           }
           System.out.println(" ");
       }
    }
}
public class graphimplementation {
    public static void main(String[] args) {
         graph obj = new graph(5);
         obj.addedge(0,1);
        obj.addedge(0,3);
        obj.addedge(1,2);
        obj.addedge(1,3);
        obj.addedge(2,4);
        obj.addedge(3,4);
        obj.display();
    }
}
