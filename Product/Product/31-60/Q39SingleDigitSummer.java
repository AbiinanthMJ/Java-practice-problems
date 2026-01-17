import java.util.Scanner;

public class Q39SingleDigitSummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input1 = scanner.nextInt();
        System.out.println("Result = " + sumUptoSingleDigit(input1));
        scanner.close();
    }

    public static int sumUptoSingleDigit(int input1) {
        input1 = Math.abs(input1);
        while (input1 > 9) {
            int temp = 0;
            while (input1 != 0) {
                temp += input1 % 10;
                input1 /= 10;
            }
            input1 = temp;
        }
        return input1;
    }
}

