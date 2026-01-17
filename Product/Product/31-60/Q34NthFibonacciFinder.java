import java.util.Scanner;

public class Q34NthFibonacciFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = scanner.nextInt();
        int fibNumber = findNthFibonacci(n);
        System.out.println(n + "th Fibonacci number = " + fibNumber);
        scanner.close();
    }

    public static int findNthFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        int first = 1, second = 1, fib = 0;
        for (int i = 3; i <= n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        return fib;
    }
}
