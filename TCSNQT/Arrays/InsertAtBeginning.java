package TCSNQT.Arrays;
// this can be only implemented when the 0 is been added in the end of the array ;
import java.util.Arrays;
public class InsertAtBeginning {
    static void InsertAtBeginning(int [] arr , int value){
        int n = arr.length;
        for(int i=n-1;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=value;
    }
    public static void main(String[] args) {
        int [] nums = {10,9,14,8,20,48,16,9,0};
         InsertAtBeginning(nums,10);
        System.out.println(Arrays.toString(nums));
    }
}
