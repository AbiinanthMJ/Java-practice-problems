package problems;
import java.util.*;
public class trappingrainwater {
    public static void main(String[] args) {
       int[] array = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
       int[] left = new int[array.length];
        int[] right = new int[array.length];
        int max=-1;
        int watercount=0;
        if(array.length<0) return ;
        for(int i=0;i<array.length;i++){
            max=Math.max(max,array[i]);
            left[i]=max;
        }
        max=-1;
        for(int i=array.length-1;i>=0;i--){
            max=Math.max(max,array[i]);
            right[i]=max;
        }
       for(int i=0;i<array.length;i++){
           watercount += Math.min(left[i], right[i]) - array[i];
       }
    }
}
