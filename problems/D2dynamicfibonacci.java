package problems;
import java.util.*;
public class D2dynamicfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        if (n <= 1) {
            System.out.println("It Is Not Possible");
        }
        else{
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            for(int num:dp){
                System.out.println(num);
            };
        }
    }


}
