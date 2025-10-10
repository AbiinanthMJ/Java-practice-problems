package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class D79_1 {
    public static void main(String[] args) {
        int target=8;
        int nums[] = {5,7,7,8,8,10};
        int [] res={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                break;
            }
        }
        if(res[0]==-1){
            System.out.println(res);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                res[1]=i;
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
