import java.util.Scanner;

public class Q125VowelExtractor {
    public static String filterVowels(String input1) {
        StringBuilder sb = new StringBuilder();
        for (char c : input1.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String vowelsOnly = filterVowels(input);
        System.out.println("Extracted vowels: " + vowelsOnly);
        sc.close();
    }
}

