import java.util.Scanner;

public class Q35ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        int result = computeExpression(a, b);
        System.out.println("Result = " + result);
        scanner.close();
    }

    public static int computeExpression(int a, int b) {
        return (int) Math.pow(a + b, 3);
    }
}

