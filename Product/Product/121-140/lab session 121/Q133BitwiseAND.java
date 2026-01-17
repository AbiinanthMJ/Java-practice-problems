import java.util.Scanner;
class Q133BitwiseAND {
    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two ints: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("AND Result: " + bitwiseAnd(a, b));
        sc.close();
    }
}
