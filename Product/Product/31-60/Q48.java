public class Q48 {
    static int base17ToDecimal(String str) {
        int result = 0, base = 17;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int value = (ch >= '0' && ch <= '9') ? (ch - '0') : (ch - 'A' + 10);
            result = result * base + value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Base-17 '23GF' to decimal: " + base17ToDecimal("23GF")); // Output: 10980
    }
}
