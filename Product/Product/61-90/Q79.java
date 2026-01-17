public class Q79 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int gcd = a, lcm = b;
        while (lcm != 0) {
            int temp = lcm;
            lcm = gcd % lcm;
            gcd = temp;
        }
        System.out.println((a * b) / gcd);
    }
}
