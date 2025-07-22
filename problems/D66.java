package problems;
import java.util.*;
public class D66 {
    public static void main(String[] args) {
        int [] nums = {5,2,1,2,5,2,1,2,5};
        int start=0,end=0,greaterSum=0,sum=0;
        HashSet set = new HashSet();// we can also use arrayList also but is takes more time to find the element
        while(end< nums.length){
            if(set.contains(nums[end])){
                sum-=nums[start];
                set.remove(nums[start]);
                start++;
                continue;
            }
            sum+=nums[end];
//            greaterSum = greaterSum>sum?greaterSum:sum;
            greaterSum = Math.max(greaterSum,sum);// what ever the situation is the greater sum keeps
            // track of the greater sum often in any situation so that the greater sum is done
            set.add(nums[end]);
            end++;
        }
        System.gc();
//        return greaterSum;
        System.out.println(greaterSum);
    }
}
