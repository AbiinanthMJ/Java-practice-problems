package vh;
import java.util.*;
public class n17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Input operation choice
        System.out.print("Enter operation (a - Add, s - Subtract, m - Multiply, d - Divide, u - Modulus): ");
        char operation = sc.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (operation) {
            case 'a':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 's':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 'm':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 'd':
                if (num2 != 0) {
                    double div = (double) num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + div);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 'u':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Modulus by zero");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                valid = false;
        }

        sc.close();
    }
}


