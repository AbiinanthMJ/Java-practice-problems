package problems;
public class D70 {
    public static void main(String[] args) {
        int [] arr ={2,2,2,1,2,2,1,2,2,2};
        int [] dp  = new int[arr.length];
        int k=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                dp[i]=1;
            }
            else{
                dp[i]=0;
            }
        }
        int stidx=0,endidx=0,tsum=0,cnt=0;
        while (endidx<arr.length){
            tsum+=dp[endidx];
            if(tsum==k){
                cnt++;
                tsum-=dp[stidx];
                stidx++;
            }
            else{
                tsum+=dp[endidx];
                endidx++;
            }
        }
        System.out.println(cnt);
    }
}
