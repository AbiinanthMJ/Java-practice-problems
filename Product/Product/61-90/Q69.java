public class Q69 {
    public static void main(String[] args) {
        int num = 12345;
        int count = countDigits(num);
        System.out.println(count);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
