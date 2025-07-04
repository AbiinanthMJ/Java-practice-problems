package Hackwithinfy;

public class Easy {
    public int processQueries(int[] A, int[][] queries) {
        int MOD = 1_000_000_007;
        long totalSum = 0;
        for (int[] query : queries) {
            int type = query[0];
            int l = query[1];
            int r = query[2];
            if (type == 1) {
                int base = A[l];
                for (int i = l; i <= r; i++) {
                    A[i] = (int)(((long)(i - l + 1) * base) % MOD);
                }
            } else if (type == 2) {
                long sum = 0;
                for (int i = l; i <= r; i++) {
                    sum = (sum + A[i]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }
        return (int) totalSum;
    }
    public static int maxGoodSubarraySum(int[] A, int k) {
       
        return k;
    }

    public static void main(String[] args) {
        Easy o = new Easy();
        int[] A1 = {1, 2, 2, 3, 2, 3, 5, 1, 2, 1, 1};
        int k1 = 2;
        System.out.println("Output 1: " + o.maxGoodSubarraySum(A1, k1)); // Expected: 12

        // Sample Input 2
        int[] A2 = {-1, -2, -3};
        int k2 = 1;
        System.out.println("Output 2: " + o.maxGoodSubarraySum(A2, k2)); // Expected: 0

        // Sample Input 3
        int[] A3 = {-1, 1, 3, 2, -1};
        int k3 = 5;
        System.out.println("Output 3: " + o.maxGoodSubarraySum(A3, k3));
//        int[] A1 = {1, 4, 5, 1, 6, 7, 8};
//        int[][] queries1 = {
//                {1, 1, 6},
//                {1, 1, 5},
//                {2, 5, 5},
//                {2, 3, 4},
//                {2, 3, 3}
//        };
//        System.out.println(o.processQueries(A1, queries1));
//
//        int[] A2 = {3, 7, 4, 2, 5, 3, 7};
//        int[][] queries2 = {
//                {1, 0, 4},
//                {2, 0, 1},
//                {1, 3, 6},
//                {2, 3, 3},
//                {2, 0, 5}
//        };
//        System.out.println( o.processQueries(A2, queries2));
//
//        int[] A3 = {1, 8, 6, 10, 5, 6, 9};
//        int[][] queries3 = {
//                {2, 0, 3},
//                {1, 2, 3},
//                {1, 0, 6},
//                {2, 1, 4},
//                {2, 6, 6}
//        };
//        System.out.println( o.processQueries(A3, queries3));
    }
}
