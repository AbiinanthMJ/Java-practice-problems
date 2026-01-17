public class Q64 {
    public static void main(String[] args) {
        int n = 4;
        trianglePattern(n);
    }

    public static void trianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
