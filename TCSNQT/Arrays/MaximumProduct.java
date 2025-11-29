package TCSNQT.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int [] nums = {1,2,-3,0,-4,-5};
        int maxProd = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        System.out.println(maxProd);
    }
}
