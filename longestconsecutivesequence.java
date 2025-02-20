import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class longestconsecutivesequence {
    public  int longestconsecutivesequence(){
        int[] nums = {100, 4, 200, 1, 3, 2};
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int maxStreak = 1;
        int currentStreak = 1;

        while (j < nums.length) {
            if (nums[j] == nums[j - 1] + 1) {
                currentStreak++;
            } else if (nums[j] != nums[j - 1]) {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
            j++;
        }

        maxStreak = Math.max(maxStreak, currentStreak); 
        return maxStreak;
    }
    public static void main(String[] args) {
         longestconsecutivesequence obj = new longestconsecutivesequence();
         obj.longestconsecutivesequence();
        System.out.println(obj.longestconsecutivesequence());
    }
}
