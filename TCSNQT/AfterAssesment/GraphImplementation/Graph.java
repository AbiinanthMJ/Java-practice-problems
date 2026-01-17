package TCSNQT.AfterAssesment.GraphImplementation;

import java.util.ArrayList;
import java.util.*;
public class Graph {
    static  ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Graph(int v){
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void display(){
        for(int i=0;i<list.size();i++){
           for(int j=0;j<list.get(i).size();j++){
               System.out.print(list.get(i).get(j));
           }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.display();
    }
}
