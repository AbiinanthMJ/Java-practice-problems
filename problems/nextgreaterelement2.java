package problems;
import java.util.Arrays;
import java.util.Stack;
public class nextgreaterelement2 {
    public static void main(String[] args) {
        nextgreaterelement2 obj1= new nextgreaterelement2();
        System.out.println(Arrays.toString(obj1.nge2()));
    }
    public int[] nge2(){
        int []nums={5,4,3,2,1};
        int [] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<nums.length;i++){
            stack.push(nums[i]);
            int top = stack.peek();
            for (int j=1;j<nums.length;j++){
                int nextIndex = (i + j) % nums.length;
                if(nums[nextIndex]>top){
                    ans[i]=nums[nextIndex];
                    stack.pop();
                    break;
                }
            }
        }
        return ans;
    }
}
