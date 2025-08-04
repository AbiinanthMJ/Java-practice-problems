package problems;

public class D75_1 {

    public int maxfruits(int [][] fruits, int startpos , int k) {
        int right=0,left=0,total=0,maxfruits=0,n=fruits.length;
        while (right<n){
            total=total+fruits[right][1];
            while(left<=right&&!cancover(startpos,fruits[left][0],fruits[right][0],k)){
                  total=total-fruits[left][1];
                  left++;
            }
            maxfruits=Math.max(total,maxfruits);
            right++;
        }
        return maxfruits;
    }
    public boolean cancover(int start , int left, int right , int k ){
        int goLeftFirst = Math.abs(start - left) + (right - left);
        int goRightFirst = Math.abs(start - right) + (right - left);
        return Math.min(goLeftFirst, goRightFirst) <= k;
    }

    public static void main(String[] args) {
        int[][] fruits = {{2,8},{6,3},{8,6}};
        D75_1 o = new D75_1();
        int result = o.maxfruits(fruits, 5, 4);
        System.out.println(result);
    }
}
