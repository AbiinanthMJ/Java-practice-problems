package study;

import java.util.Arrays;
// this  is the basic sliding window we have to print all the subarrays think about it
public class slidingwindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int [] prefixsum={};
        int k=9;//->we need to find the subarray that sums upto 9
        int start =0;
        int end =1;
        int sum=arr[start]+arr[end];
        while(end<arr.length){
            if(sum>k){
                sum=sum-arr[start];
            }
            else{
                end++;
                if(end<arr.length){
                    sum=sum+arr[end];
                }
            }
            if(sum==k){
                System.out.println("A k target is been found at ");
                break;
            }
        }
    }
}
