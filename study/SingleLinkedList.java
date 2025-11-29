package study;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//public class linkedlist {
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        LinkedList<Integer> llw = new LinkedList<>();
//        List arr = new LinkedList();
//        arr.add(Integer.valueOf(1));
//        arr.add("Abiinanth");
//        arr.addFirst(-20);
//        arr.addLast(20);
//        System.out.println(arr);
//        for (int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//        }
////      for(Integer x : arr){
////         System.out.println(x);
////      }
//        Iterator it = arr.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        ________________________________________________________________________
//        see in linked list there is also a method called offer , offerfirst , offerlast
//        this basically where there is need to handle exception and throw a error based on our own opinion
//        -------------------------------------------------------------------------
//        today it is enough ..............take some rest 😷
//        this is a new linked list studing stuff ...............may god bless me
//        cm
//    }
//}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist {
    Node head, tail;
    public void insert(int data) {
        Node newnode = new Node(data);// oru object create aguthu ;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
//    public void insertBeg(int data){
//        BinarySearchTree n = new BinarySearchTree(data);
//        head=n;
//    }
//    public void insertAtEnd(int data){
//        BinarySearchTree n = new BinarySearchTree();
//        n.data=data;
//        tail.next=n;
//        tail=n;
//    }
//    public void insertAtPos(int pos,int data){
//           BinarySearchTree n = new BinarySearchTree();
//           n.data=data;
//           BinarySearchTree temp =  head;
//           for(int i=0;i<pos-1;i++){
//               temp=temp.next;
//           }
//           n.next=temp.next;
//           temp.next=n;
//    }
//    public void deleteAtBeg(){
////         BinarySearchTree temp=head;
//         head=head.next;
////         temp.next=null;
//    }

//    public void deleteAtEnd(){
//        BinarySearchTree n = new BinarySearchTree();
//        BinarySearchTree temp = head;
//        while(temp.next!=tail){
//            temp=temp.next;
//        }
//        temp.next=null;
//        tail=temp;
//    }
//    public void deleteAtPos(int pos){
//        BinarySearchTree n = new BinarySearchTree();
//        BinarySearchTree temp=head;
//        for(int i=0;i<pos-1;i++){
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        l.insert(10);
        l.insert(20);
        l.insert(30);
//        l.insertBeg(5);
//        l.insertAtEnd(30);
//        l.insertAtPos(2,15);
//        l.deleteAtBeg();
//        l.deleteAtEnd();
//        l.deleteAtPos(2);
        l.Display();
    }
}
