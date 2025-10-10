package problems;

public class D82 {
    public static void main(String[] args) {
        D82 sol = new D82();

        // Test case 1
        int n1 = 10;
        int[][] logs1 = {{0,3},{2,5},{0,9},{1,15}};
        System.out.println(sol.hardestWorker(n1, logs1)); // Expected: 1

        // Test case 2
        int n2 = 26;
        int[][] logs2 = {{1,1},{3,7},{2,12},{7,17}};
        System.out.println(sol.hardestWorker(n2, logs2)); // Expected: 3

        // Test case 3
        int n3 = 2;
        int[][] logs3 = {{0,10},{1,20}};
        System.out.println(sol.hardestWorker(n3, logs3)); // Expected: 0
    }

    int hardestWorker(int n , int [][] logs) {
        int previoustime = 0;
        int max = 0;
        int ans = Integer.MAX_VALUE;

        for (int[] log : logs) {
            int id = log[0];
            int leaveTime = log[1];
            int duration = leaveTime - previoustime;

            if (duration > max) {
                max = duration;
                ans = id;
            }
            else if (duration == max && id < ans) {
                ans = id;
            }

            previoustime = leaveTime;
        }
        return ans;
    }
}
