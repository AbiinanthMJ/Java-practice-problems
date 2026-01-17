package TCSNQT.AfterAssesment.Treeimplemenation;

class node {
    int val;
    int left;
    int right;

    node(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    node root;
    BinaryTree(int val) {
        root = new node(val);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        System.out.println(tree.root.val);
    }
    public static void insertLeft(int val , node root){
        root.left= val;
    }
    public static void insertRight(int val , node root){
        root.right=val;
    }


}