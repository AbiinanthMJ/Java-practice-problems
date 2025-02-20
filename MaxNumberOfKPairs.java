import java.util.Arrays;
import java.util.List;

public class MaxNumberOfKPairs {
    public int maxNumbersDiagonalArray() {
        System.out.println("started");
        int k = 6;
        int nums[] = {3, 1, 3, 4, 3,3,3};
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count =0;
        while(i<j){
            int sum=nums[i]+nums[j];
//            this ensures that the matched numbers are nit been used another time
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if (sum < k) {
                i++; // Increase the sum
            } else if(sum>k){
                j--; // Decrease the sum
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxNumberOfKPairs obj = new MaxNumberOfKPairs();
            System.out.println(obj.maxNumbersDiagonalArray());
    }
}
