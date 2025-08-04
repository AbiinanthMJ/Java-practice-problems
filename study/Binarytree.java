package study;
// Take aways-----------
//...means that the current node will have references to two other Node objects
// — one on the left and one on the right (as in a binary tree structure).
class BNode{
    BNode(int data){
        this.data=data;
    }
    int data;
//     Self-Referential Class
    BNode left;
    BNode right;

}
class Binary{
    BNode root;
    Binary(int data){
        root= new BNode(data);
    }
    public void insertleft(BNode root,int data){
          root.left= new BNode(data);
    }
    public void insertright(BNode root,int data){
        root.right= new BNode(data);
    }
}
public class Binarytree {
    public static void main(String[] args) {
        Binary bt = new Binary(1);
        bt.insertleft(bt.root,2);
        bt.insertright(bt.root,4);
    }
}

