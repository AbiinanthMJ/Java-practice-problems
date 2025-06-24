package problems;
class nodde{
    int data;
    nodde nextnodeaddress;
}
public class linkedlistpractice2 {
    nodde head,tail;
    void insert(int data){
        nodde newnode = new nodde();
        newnode.data=data;
        newnode.nextnodeaddress=null;
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.nextnodeaddress=newnode;
            System.out.println("value from the before tail shifting to the next node "+tail.nextnodeaddress.data);
            tail=tail.nextnodeaddress;
            System.out.println("value from the after tail shifting to the next node "+tail.data);
        }
    }
    void  display(){
         nodde temp ;
         temp=head;
         while(temp!=null){
             System.out.print(temp.data);
             System.out.print(" -- > ");
             temp=temp.nextnodeaddress;
         }
    }
    public static void main(String[] args) {
        linkedlistpractice2 linkedlist = new linkedlistpractice2();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.display();
    }
}
