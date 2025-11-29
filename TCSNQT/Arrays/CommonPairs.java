package TCSNQT.Arrays;

public class CommonPairs {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2},
                {2, 1},
                {3, 4},
                {4, 5},
                {5, 4}
        };
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
                    break;
                }
            }
        }
    }
}
