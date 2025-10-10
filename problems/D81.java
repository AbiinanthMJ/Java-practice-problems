package problems;

class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        int i = 0, j = 0, sum = 0;
        while (j < arr.length) {
            sum += arr[j];

            // shrink window if sum > k
            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                return true; // found match
            }

            j++;
        }
        Character.toLowerCase('a');
        return false;
    }   
}
