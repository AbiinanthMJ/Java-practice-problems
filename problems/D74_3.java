package problems;

import java.util.Arrays;

public class D74_3 {
    public static void main(String[] args) {
        int [] arr ={2, 3, 1, 1, 4};
        int maxump=Integer.MAX_VALUE;
        boolean [] dp = new boolean[arr.length + 1];
        dp[0]=true;
        for(int i=0;i<arr.length;i++){
              if(dp[i]){
                  maxump = Math.min(i+arr[i],arr.length-1);
              }
              for(int j=i+1;j<=maxump;j++){
                  dp[j]=true;
              }
        }
//        return dp[arr.length-1];
        System.out.println(dp[arr.length-1]);
    }
}
