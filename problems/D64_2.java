package problems;

import java.util.Arrays;

public class D64_2 {
    public static void main(String[] args) {
        int [] arr ={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,
                65,67,92,-28,97,100,81};
        //[dp]-->0,-5,-4,1,1,-6
        int [] dp = new int[arr.length+1];
        dp[0]=0;
        dp[1]=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=2;i<=arr.length;i++){
            dp[i]=dp[i-1]+arr[i-1];
        }
        for(int i=0;i<dp.length;i++){
            max=Math.max(max,dp[i]);
        }
//        System.out.println(max);
//        return max;
        Arrays.stream(dp).forEach(System.out::println);
    }
}
