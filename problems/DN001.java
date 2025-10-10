package problems;

import java.util.Arrays;

public class DN001 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 2, 3, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                break;
            } else {
                c++;
            }
        }
        for (int i = 0; i < c - 1; i++) {
            for (int j = 0; j < c - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = c; i < arr.length - 1; i++) {
            for (int j = c; j < arr.length - 1 - (i - c); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
