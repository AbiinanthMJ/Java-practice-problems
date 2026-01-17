public class Q68 {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalin = isPalindrome(str);
        System.out.println(isPalin);
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
