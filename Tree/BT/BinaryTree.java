package Tree.BT;

import java.util.*;
public class BinaryTree {
    BinaryTree(){

    }
    class Node {
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the value of the Root node :");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc , Node node){
        System.out.print("Do you want to enter the left of"+node.value+"true/false");
        Boolean left = sc.nextBoolean();
        System.out.println("Enter the left node value");
        if(left){
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter the right of"+node.value+"true/false");
        Boolean right = sc.nextBoolean();
        System.out.println("Enter the right node value");
        if(right){
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    public void display(Node root, String indent){
        System.out.println(indent+root.value);
        display(root.left,"");
        display(root.right,indent+"/t");

    }

}
