package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class D78 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
       int i=0,j=1;
       while(i<arr.length){
           if(arr[i]==arr[j]){
               list.add(arr[i]);
           }
       }
    }
}
