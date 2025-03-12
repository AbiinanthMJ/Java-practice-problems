package problems;

public class slidingwindow {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
//        edge case
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : array) {
            minPrice = Math.min(minPrice, price); // Keep track of the lowest price
            maxProfit = Math.max(maxProfit, price - minPrice); // Max profit from current price
        }
        System.out.println(maxProfit);
    }
}
