package TCSNQT.Arrays;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int n = nums.length;
        int rn = n - k;
        for (int i = 0; i < k; i++) {
            int temp = nums[i];
            nums[i] = nums[rn + i];
            nums[rn + i] = temp;
        }
        int kn = rn-k;
        for(int i=k;i<rn-k;k++){
            
        }
        System.out.println(Arrays.toString(nums));
    }
}
