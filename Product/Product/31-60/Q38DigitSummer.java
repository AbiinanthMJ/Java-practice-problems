import java.util.Scanner;

public class Q38DigitSummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input1 = scanner.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(input1));
        scanner.close();
    }

    public static int sumOfDigits(int input1) {
        input1 = Math.abs(input1);
        int sum = 0;
        while (input1 != 0) {
            sum += input1 % 10;
            input1 /= 10;
        }
        return sum;
    }
}

