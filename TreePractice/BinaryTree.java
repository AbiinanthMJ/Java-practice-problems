package TreePractice;
import oops.Interface.B;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class node{
    int value;
    node left;
    node right;

    public node(int value) {
        this.value = value;
        left=right=null;
    }
}
public class BinaryTree {
    node root ;
    BinaryTree(){
        root=null;
    }
    void insert(int value){
        if(root==null){
            root=new node(value);
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node temp = q.poll();
            if(temp.left==null){
                temp.left=new node(value);
                break;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new node(value);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }
    void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+", ");
        inorder(root.right);
    }
    public static void main(String[] args) {
          BinaryTree bt = new BinaryTree();
          for(int i=0;i<10;i++){
              Random  random = new Random();
              int value=random.nextInt(100);
              bt.insert(value);
          }
          bt.inorder(bt.root);
    }
}
