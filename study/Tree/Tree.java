package study.Tree;

import java.util.Scanner;

public class Tree {
    public Tree() {
    }

    class node {
        int value;
        node right;
        node left;
        node(int value) {
            this.value = value;
        }
    }
    private node root;

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root node value: ");
        int value = sc.nextInt();
        root = new node(value);
        populate(sc, root);
    }

    void populate(Scanner sc, node node) {
        System.out.println("Do you want to enter left of " + node.value + " (true/false)?");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left value: ");
            int value = sc.nextInt();
            node.left = new node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + " (true/false)?");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right value: ");
            int value = sc.nextInt();
            node.right = new node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    void display(node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");   // left subtree
        display(node.right, indent + "\t");  // right subtree ✅ fixed
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        tree.populate(sc);
        System.out.println("\nTree Structure:");
        tree.display();

        sc.close();
    }
    void prettydisplay(){
    // this is bending the recursion cant able to understand ;
    }


}
