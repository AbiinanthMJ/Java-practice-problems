package problems;
import java.util.*;
public class D71 {
    public static void main(String[] args) {
        int [] nums = {2,4,1,1,6,5};
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        int n = stack.size();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i-1] && arr[i] > arr[i+1]) ||
                    (arr[i] < arr[i-1] && arr[i] < arr[i+1])) {
                count++;
            }
        }
        System.out.println(count);
    }
    }

