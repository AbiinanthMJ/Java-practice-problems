package AfterBreakProblemSolving;
import java.util.*;
public class D3 {
    public static void main(String[] args) {
        int n = 2;
//        int[] arr = {1, 1, 1, 1};
        //Binry Search --> The Array should be Sorted to search the value
//        int[] live = Arrays.copyOfRange(batteries, batteries.length - n, batteries.length);
//        for (int i = 0; i < n - 1; i++) {
//            if (extra < (long) (i + 1) * (live[i + 1] - live[i])) {
//                return live[i] + extra / (long) (i + 1);
//            }
//            extra -= (long) (i + 1) * (live[i + 1] - live[i]);
//        }
//        return live[n - 1] + extra / n;
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}