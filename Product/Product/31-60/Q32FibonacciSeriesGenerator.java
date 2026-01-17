import java.util.Scanner;

public class Q32FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        printFibonacciSeries(n);
        scanner.close();
    }

    public static void printFibonacciSeries(int n) {
        int first = 1, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
