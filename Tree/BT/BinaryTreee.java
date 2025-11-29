package Tree.BT;

import java.util.Scanner;

public class BinaryTreee {
    BinaryTreee(){

    }
    class node {
        int value;
        node left;
        node right;
        node(int value){
            this.value=value;
        }
    }
    public node root;
    public void populate(Scanner sc ){
        System.out.println("Enter the root node value");
        int value=sc.nextInt();
        root=new node(value);
        populate(root,sc);
    }
    public void populate(node root, Scanner sc){
        System.out.println("You want to enter the left if yes type true in the cli");
        Boolean left = sc.nextBoolean();
        System.out.println("Enter the value you need to insert in the left node ");
        if(left){
            int value= sc.nextInt();
            root.left=new node(value);
            populate(root.left,sc );
        }
    }
}
