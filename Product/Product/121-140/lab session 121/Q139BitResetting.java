import java.util.*;
class Q139BitResetting {
    public static int resetNthFromLeft(int n, int pos) {
        String bin = Integer.toBinaryString(n);
        int len = bin.length();
        if (pos > len) {
            bin = "0".repeat(pos - len) + bin;
            len = pos;
        }
        char[] arr = bin.toCharArray();
        arr[pos - 1] = '0';
        return Integer.parseInt(new String(arr), 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer and position: ");
        int n = sc.nextInt(), pos = sc.nextInt();
        System.out.println("Result: " + resetNthFromLeft(n, pos));
        sc.close();
    }
}
