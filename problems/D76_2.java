package problems;

import java.util.HashMap;

public class D76_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> countmap = new HashMap<>();
        int maxLength = 0;
        countmap.put(0, 0);
        countmap.put(1, 0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countmap.put(0, countmap.getOrDefault(0, 0) + 1);
            else countmap.put(1, countmap.getOrDefault(1, 0) + 1);
            int diff = countmap.get(1) - countmap.get(0);
            if (diff == 0) maxLength = i + 1;
            if (map.containsKey(diff))maxLength = Math.max(maxLength, i - map.get(diff));
            else map.put(diff, i);
        }
        System.out.println(maxLength);
    }
}
