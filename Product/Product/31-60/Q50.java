public class Q50 {
    static int numberOfCarries(int num1, int num2) {
        int carry = 0, count = 0;
        while (num1 > 0 || num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            if (d1 + d2 + carry >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Carries between 451 and 349: " + numberOfCarries(451, 349)); // Output: 2
    }
}
