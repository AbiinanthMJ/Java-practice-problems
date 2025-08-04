package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class D74 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                rowList.add(arr[i][j]);
            }
            list.add(rowList);
        }
        System.out.println(list.get(0));
    }

}
