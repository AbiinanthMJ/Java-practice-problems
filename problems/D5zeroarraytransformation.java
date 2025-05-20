package problems;

public class D5zeroarraytransformation {
    boolean re(){
        int []nums={1,2,2};
        int[][]  queries= {
                {1,2},
                {4,5},
        };
        int n = nums.length;
        int[] diffarray=new int[n+1];
        for(int[] q : queries){
            int start=q[0];
            int end=q[1];
            if(start<n){
            diffarray[start]=diffarray[start]+1;}
            if(end+1<n){
                diffarray[end+1]=diffarray[end+1]-1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+diffarray[i];
            if(sum<nums[i]){
                return false;
            }
        }
        // System.out.print(diffarray.toString());
        // for(int nn:diffarray){
        //     System.out.println(nn);
        // }
        return true;
    }
    public static void main(String[] args) {
        D5zeroarraytransformation obj = new D5zeroarraytransformation();
        obj.re();
    }
}
