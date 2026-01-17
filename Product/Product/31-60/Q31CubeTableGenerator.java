import java.util.Scanner;

public class Q31CubeTableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        printCubeTable(n);
        scanner.close();
    }

    public static void printCubeTable(int n) {
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Cube(" + i + ") = " + cube);
        }
    }
}
