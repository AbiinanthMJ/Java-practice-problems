package problems;
class node{
    int data;
    node next;
}
public class linkedlistpractice {
    node head,tail;
    void insert(int data){
        node newnode = new node();
        newnode.data=data;
        newnode.next=null;
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
//    void insertAtBeginning(int data){
//         node temp = new node();
//         temp.data=data;
//         temp.next=head;
//         head=temp;
//    }
     void insertAtPosition(int pos, int data){
         node currentinsrt = new node();
         int idx=0;
         node temp =head;
         currentinsrt.data=data;
         currentinsrt.next=temp;
         while(temp.next!=null){
             temp=temp.next;
             idx++;
             if(idx==pos){
                 temp.next=null;
             }
         }
    }
    void deleteFirst(){

    }
    void deleteLast(){

    }
    void deleteAtPosition(int pos){

    }
    void length(){

    }
    void display(){
        node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data);
            System.out.print(" - >");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedlistpractice linkedlist = new linkedlistpractice();
        for(int i=0;i<5;i++){
            linkedlist.insert(i);
        }
//        linkedlist.insertAtBeginning(10);
        linkedlist.display();
    }
}
