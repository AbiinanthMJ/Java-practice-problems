import java.util.Scanner;

public class Q37DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input1 = scanner.nextInt();
        int count = countNumberOfDigits(input1);
        System.out.println("Number of digits: " + count);
        scanner.close();
    }

    public static int countNumberOfDigits(int input1) {
        if (input1 == 0) {
            return 1;
        }
        int count = 0;
        while (input1 != 0) {
            input1 /= 10;
            count++;
        }
        return count;
    }
}

