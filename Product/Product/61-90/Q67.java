public class Q67 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
