public class Q49 {
    static char[] decimalToBaseN(int n, int number) {
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append(digits.charAt(number % n));
            number /= n;
        }
        return sb.reverse().toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println("Decimal 718 to Base-12: " + new String(decimalToBaseN(12, 718))); // Output: 4BA
    }
}
