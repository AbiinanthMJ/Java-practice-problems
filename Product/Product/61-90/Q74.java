public class Q74 {
    public static void main(String[] args) {
        int n = 17;
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime && n > 1);
    }
}
