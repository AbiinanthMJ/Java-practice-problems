import java.util.*;
class Q130BinaryString {
    public static int Operations(String str) {
        if (str == null) return -1;
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int v = str.charAt(i + 1) - '0';
            switch (op) {
                case 'A': res &= v; break;
                case 'B': res |= v; break;
                case 'C': res ^= v; break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation string: ");
        String s = sc.nextLine();
        System.out.println("Result: " + Operations(s));
        sc.close();
    }
}

