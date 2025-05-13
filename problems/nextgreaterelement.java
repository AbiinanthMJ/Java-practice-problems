    package problems;

    import java.util.Arrays;
    import java.util.Stack;

    public class nextgreaterelement {
        public static void main(String[] args) {
            nextgreaterelement obj1=new nextgreaterelement();
            System.out.println(Arrays.toString(obj1.nge()));
        }
        public int[] nge(){
            int [] num1={4,1,2};
            int [] nums2={1,3,4,2};
               int [] ans =new int [num1.length];
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<num1.length;i++){
                      stack.push(num1[i]);
                      boolean found = false;
                      for(int j=0;j<nums2.length;j++){
                          if(stack.peek()==nums2[j]){
                              found=true;
                          }
                          if(found && nums2[j]>stack.peek() ){
                              ans[i]=nums2[j];
                              stack.pop();
                              break;
                          }
                      }
                }
            for (int i = 0; i < ans.length; i++) {
                if (ans[i] == 0) {
                    ans[i] = -1;
                }
            }
            return ans;
        }
    }
