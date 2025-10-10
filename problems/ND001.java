package problems;

import java.util.ArrayList;

public class ND001 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 6, 6};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int k = 15;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // avoid duplicates
                if (arr[i] + arr[j] == k) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    list.add(pair);
                }
            }
        }

        System.out.println("\nAll Pairs:");
        for (ArrayList<Integer> l : list) {
            System.out.println(l);
        }
    }
}
