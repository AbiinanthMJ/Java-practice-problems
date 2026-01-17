import java.util.Scanner;

public class Q122DigitExtractor {
    public static String filterDigits(String input1) {
       
        return input1.replaceAll("[^0-9]", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        String digitsOnly = filterDigits(input);
        System.out.println("Extracted digits: " + digitsOnly);
        sc.close();
    }
}

