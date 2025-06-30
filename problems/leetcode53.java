import java.util.Arrays;

public class leetcode53 {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};//6
        int currentsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>currentsum){
                currentsum=sum;
            }
            else {
                sum=Math.max(currentsum,sum);
            }
        }
        System.out.println(currentsum);

    }
}
