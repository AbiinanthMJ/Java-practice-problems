import java.util.*;
class Q137OnesComplement {
    public static int onesComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (char c : bin.toCharArray()) sb.append(c == '1' ? '0' : '1');
        return Integer.parseInt(sb.toString(), 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("1's complement: " + onesComplement(n));
        sc.close();
    }
}
