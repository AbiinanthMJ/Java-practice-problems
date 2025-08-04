package problems;

import java.util.Arrays;

public class D74_2 {
    /**
     Combinators (combinations) deal with selection without order.
     Different from permutations (where order matters).
     **/
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        Arrays.stream(dp).forEach(System.out::print);
        int sum =0;
        int [] dp =arr;
        int i=0;
        int idx=0;
        while (dp.length!=1){
            sum+=arr[i]+arr[i+1];
            dp[idx]=sum;
            idx++;
            i+=2;
        }
        System.out.println(Arrays.toString(dp));

    }
}
