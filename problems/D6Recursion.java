package problems;

import java.util.ArrayList;
import java.util.Arrays;
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
    void reverseinteger(int l , int r ,int[] array){
        if(l>=r){
            return;
        }
        int temp = array[l];
        array[l]=array[r];
        array[r]=temp;
        reverseinteger(l+1,r-1,array);
        for(int num:array){
            System.out.print(num);
        }
        System.out.println();
    }
    void palindrome(int l, int r,String s ){
        if (l>=r){
            System.out.println(true);
            return;
        }
       else if(s.charAt(l)==s.charAt(r)){
            palindrome(l+1,r-1,s);
        }
        else{
            System.out.println(false);
            return;
        }
    }
    //power set is required
    void sequence(int idx ,int[] arr ,ArrayList<Integer> list ,int n ,ArrayList<ArrayList<Integer>> list2,int[]itidx){
        if(idx==n){
                for(int t:list){
                    list2.get(itidx[0]).add(t);
                }
                itidx[0]++;
            return;
        }
        list.add(arr[idx]);
        sequence(idx+1,arr,list,n,list2,itidx);
        list.remove(list.size()-1);
        sequence(idx+1,arr,list,n,list2,itidx);

    }
//    We did it Boi
    public static void main(String[] args) {
//        D6Recursion obj = new D6Recursion();
//        Scanner s = new Scanner(System.in);
//        int[] arr={3,1,2};
//        int n =arr.length;
//        ArrayList<Integer>list= new ArrayList<>();
//        ArrayList<ArrayList<Integer>> list2= new ArrayList<>();
//        int count=(int)Math.pow(2,n);
//        for (int i = 0; i < count; i++) {
//            list2.add(new ArrayList<>());
//        }
//        int[] counter={0};
//        obj.sequence(0,arr,list,n,list2,counter);
//        for (ArrayList<Integer> seq : list2) {
//            if (seq.isEmpty()) {
//                System.out.println("{}");
//            } else {
//                for (int val : seq) {
//                    System.out.println(val + " ");
//                }
//                System.out.println();
//            }
//        }

//        int n = s.nextInt();
//        obj.fun(1,n);
//        obj.fun2(1);
//        obj.fun3(1,n);
//          obj.backtracking(n,n);
//        obj.backtracking2(n, n);
//        obj.backtracking3(n,0);
//        int[] array = {1,3,4,5,1};
//        String ss="madam";
//       obj.reverseinteger(0,array.length-1,array);
//        obj.palindrome(0,ss.length()-1,ss);

    }
}
