import java.util.Scanner;

public class Q135BitwiseXOR {
    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two ints: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("XOR Result: " + bitwiseXor(a, b));
        sc.close();
    }
}


