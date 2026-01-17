public class Q65 {
    public static void main(String[] args) {
        int n = 4;
        letterPattern(n);
    }

    public static void letterPattern(int n) {
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
                System.out.print(c + " * ");
                c++;
            }
            System.out.println();
        }
    }
}
