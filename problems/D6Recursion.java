package problems;

import java.util.Scanner;

public class D6Recursion {
    void fun(int i , int n ){
        if(i>n){
            return;
        }
        System.out.println("AS");
        fun(i+1,n);
    }
    void fun2(int i){
        if(i>5){
            return;
        }
        System.out.println(i);
        fun2(i+1);
    }
    void fun3(int i , int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        fun3(1,n-1);
    }
    void backtracking(int n1,int n2){
        if(n1<0){
            return;
        }
        backtracking(n1-1,n2);
        System.out.println(n1);
    }
    void backtracking2(int n1,int n2){
          if(n2+n2<n1){
              return;
          }
         backtracking2(n1+1,n2);
         System.out.println(n1-n2);
    }
    void backtracking3(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        backtracking3(n-1,sum+n);
    }
//    We did it Boi
    public static void main(String[] args) {
        D6Recursion obj = new D6Recursion();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        obj.fun(1,n);
//        obj.fun2(1);
//        obj.fun3(1,n);
//          obj.backtracking(n,n);
//        obj.backtracking2(n, n);
        obj.backtracking3(n,0);

    }
}
