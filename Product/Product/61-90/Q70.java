public class Q70 {
    public static void main(String[] args) {
        int num = 153;
        boolean result = isArmstrong(num);
        System.out.println(result);
    }

    public static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, digits);
            n /= 10;
        }
        return sum == original;
    }
}
