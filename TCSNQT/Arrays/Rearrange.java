package TCSNQT.Arrays;

import study.access.A;

import java.util.Arrays;

public class Rearrange {
    static  void swap(int idx1 , int idx2, int [] arr){
        int n1=arr[idx1];
        int n2=arr[idx2];
        int temp=n1;
        n1=n2;
        n2=temp;
        arr[idx1]=n1;
        arr[idx2]=n2;
    }
    public static void main(String[] args) {
        int [] nums = {2 ,4 ,5 ,6 ,20 ,15, 9 ,8};
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(i>=(n/2)) break;
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]>nums[j]){
                     swap(i,j,nums);
                 }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
