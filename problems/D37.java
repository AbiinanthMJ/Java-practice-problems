package problems;

public class D37 {
    /**
     * this is the easy method to check the value is palindrome or not in java
     */
     static  boolean ispalindrome(String number ){
         boolean result = true;
         int left =0, right =number.length()-1;
        if(number.charAt(left++)!=number.charAt(right--)){
            result = false;
        }
         return result;
     }
   static String respectivebasevalue(long nums , int k){
       if(nums==0)return "0";
       StringBuilder sb = new StringBuilder();
        while(nums!=0){
            sb.append(nums%k);
            nums/=k;
        }
        return sb.reverse().toString();
    }
    static boolean ispalindromeornot(){
        boolean flag=true;
        return flag;
    }
    static int number(){

         return 0;
    }
    public static void main(String[] args) {
         int k =2;
         int n =5;
//        System.out.println(respectivebasevalue(14,k));
//        System.out.println(ispalindrome("1001"));
        /** palindrome generator in java for the required length;**/


    }
}
