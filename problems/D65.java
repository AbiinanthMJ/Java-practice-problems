package problems;

import java.util.Arrays;

public class D65 {
    public static void main(String[] args) {
        String s = "leeetcode";
        int[] dp = new int[s.length()+1];
        int count=1;
        dp[0]=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                dp[i]=count;
            }
            else{
                count=1;
                dp[i]=count;
            }
        }
        for(int i=0;i<s.length();i++){
            if(dp[i]>=3){
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
//        System.out.println(sb);
        //return sb;
    }
}
