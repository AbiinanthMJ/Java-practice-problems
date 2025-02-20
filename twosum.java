import java.util.ArrayList;
import java.util.List;

public class twosum {
    public List<Integer> twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        List<Integer> storage = new ArrayList<>();

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                storage.add(l);
                storage.add(r);
                return storage;  // Return early since we found the pair
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return storage; // Return empty list if no pair is found
    }

    public static <TwoSum> void main(String[] args) {
        twoSum obj = new twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        List<Integer> result = obj.twoSum(nums, target);
        System.out.println(result); // Output: [0, 1] (indices of the numbers that add up to 9)
    }
}
