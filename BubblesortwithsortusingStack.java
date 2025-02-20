import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
public class BubblesortwithsortusingStack {
    public static void main (String[] args){
            int[] unsortedarray=new int[] {1,6,3,5,6};
            int n =unsortedarray.length;
            for (int i=0; i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if (unsortedarray[j]<unsortedarray[j+1]){
                        int temp =unsortedarray[j];
                        unsortedarray[j]=unsortedarray[j+1];
                        unsortedarray[j+1]=temp;
                    }
                }
            }
            for(int nums: unsortedarray){
                System.out.println(nums);
            }
            System.out.println(Arrays.toString(unsortedarray));
            Stack <Integer> stack = new Stack<>();
            for (int nums: unsortedarray){
                stack.push(nums);
            }
            for(int i=0;i<unsortedarray.length;i++){
                unsortedarray[i]=stack.pop();
            }
            System.out.println(Arrays.toString(unsortedarray));
        }


}
