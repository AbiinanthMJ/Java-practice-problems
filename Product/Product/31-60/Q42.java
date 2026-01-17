public class Q42 {
    static int primeDigitSum(int input1) {
        int sum = 0;
        while (input1 > 0) {
            int d = input1 % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7) sum += d;
            input1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Prime Digit Sum of 12377: " + primeDigitSum(12377)); // Output: 19
    }
}
