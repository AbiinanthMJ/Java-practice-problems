package problems;
import java.util.ArrayList;
import java.util.HashSet;
public class D73 {
    public static  void printSubarrays(int[] arr, int start, int end, ArrayList<Integer> list,HashSet<Integer> set) {
        if (start == arr.length) return;
        if (end == arr.length) {
            printSubarrays(arr, start + 1, start + 1, new ArrayList<>(),set);
            return;
        }
        list.add(arr[end]);
        int orValue = 0;
        for (int num : list) orValue |= num;
        set.add(orValue);
        System.out.println(list + " → OR = " + orValue);
        printSubarrays(arr, start, end + 1, new ArrayList<>(list),set);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println("All subarrays with OR values:");
        printSubarrays(arr, 0, 0, new ArrayList<>(),new HashSet<>());
    }
}
