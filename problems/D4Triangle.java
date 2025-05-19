package problems;
import java.util.*;
public class D4Triangle {
        public String triangleType(int[] nums) {
            Arrays.sort(nums);
            int a = nums[0];
            int b = nums[1];
            int c= nums[2];
            if (a + b <= c)return "none";
            if (a == b && b == c) return "equilateral";
            if (a == b || b == c || c == a) return "isosceles";
            else return "scalene";
        }

    public static void main(String[] args) {
        D4Triangle tc = new D4Triangle();
        String s=tc.triangleType(new int[]{3,1,3});
        System.out.println(s);
    }
    }

