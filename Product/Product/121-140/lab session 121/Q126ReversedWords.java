import java.util.Scanner;

public class Q126ReversedWords {
    public static String reverseAndConcat(String input1) {
        StringBuilder result = new StringBuilder();
        String[] words = input1.trim().split("\\s+");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse());  
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = reverseAndConcat(input);
        System.out.println("Result:" + output);
        sc.close();
    }
}

