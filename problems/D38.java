package problems;
import java.util.*;
public class D38 {
    public static void main(String[] args) {
        int [] nums = {3,4,2,8,9,3,6,6,4,8,5,6,3};
        int key = 8;
        int k =2;
        int left = 0, right = 0, i = 0;
        Set<Integer> set = new TreeSet<>();
        while (i <= nums.length - 1) {
            if (nums[i] == key) {
                left = Math.max(0, i - k);
                right = Math.min(nums.length - 1, i + k);
                while (left <= right) {
                    set.add(left);
                    left++;
                }
            }
            i++;
        }
        System.out.println(set);
    }
}
