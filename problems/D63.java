package problems;
import java.util.*;
public class D63 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i=1,j=arr.length-1;
        int currentmax=arr[0];
        int totalmax=arr[0];
        while(i<=j){
           int temp= currentmax+arr[i];//-->this is very imprtant -Carry forward logic *
            // this makes the value to continue adding if the current number is n0t greater than the previously added numbers
            if(temp<arr[i]){
               currentmax=arr[i];
            }
            else{
               currentmax=temp;
            }
            if(currentmax>totalmax){
                totalmax=currentmax;
            }
            i++;
        }
        System.out.println(totalmax);
        // tomorrrow i will make this code to return the sub array itself :)
    }
}
