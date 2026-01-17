public class Q41 {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }

    public static void main(String[] args) {
        System.out.println("nCr(5,2): " + nCr(5, 2)); // Output: 10
    }
}
