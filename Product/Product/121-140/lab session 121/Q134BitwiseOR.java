import java.util.Scanner;

public class Q134BitwiseOR {

    public static int bitwiseOr(int a, int b) {
        return a | b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two ints: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("OR Result: " + bitwiseOr(a, b));
        sc.close();
    }
}

