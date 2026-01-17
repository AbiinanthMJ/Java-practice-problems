public class Q81 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n = i, sum = 0, digits = String.valueOf(i).length();
            while (n > 0) {
                int r = n % 10;
                sum += Math.pow(r, digits);
                n /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
