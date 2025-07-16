package problems;
import java.util.*;
/** Print the target subsequences in the given array **/
public class D61 {
    void prints(int idx, List<Integer> list, int currentSum, int targetSum, int[] arr, int n){
        if (idx == n) {
            if (currentSum == targetSum) {
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[idx]);
        currentSum+=arr[idx];
        prints(idx+1,list,currentSum,targetSum,arr,n);
        currentSum-=arr[idx];
        list.remove(list.size()-1);
        prints(idx+1,list,currentSum,targetSum,arr,n);
    }
    void prints2(int idx, List<Integer> list, int currentSum, int targetSum, int[] arr, int n){
        /**   this uses a forward tracking and a backward tracking system to check the count   **/
    }
    public static void main(String[] args) {
        D61 obj = new D61();
         int [] arr = {1,2,1};
         int n =arr.length;
         int k=2;
        List<Integer> list = new ArrayList<>();
//        obj.prints(0, list, 0, k, arr, n);
        obj.prints2(0, list, 0, k, arr, n);
    }
}
