package TCSNQT.Arrays;

import java.util.Arrays;

public class RankOfArray {

    public static int[] BubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = {20, 15, 26, 2, 98, 6};
        int[] original = Arrays.copyOf(arr, arr.length);
        int[] sorted = BubbleSort(arr);
        int[] rank = new int[arr.length];
        for (int i = 0; i < original.length; i++) {
            int element = original[i];
            for (int j = 0; j < sorted.length; j++) {
                if (sorted[j] == element) {
                    rank[i] = j + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(rank));
    }
}
