import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        System.out.println(list);
    }
}
