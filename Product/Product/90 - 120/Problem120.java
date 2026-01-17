import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem120 {
    public static void main(String[] args) {
        String input1 = "AABBBBBC";
        System.out.println("Output: " + getDuplicateChars(input1)); 

        String input2 = "RRR";
        System.out.println("Output: " + getDuplicateChars(input2));

        String input3 = "programming";
        System.out.println("Output: " + getDuplicateChars(input3)); 
    }

    static String getDuplicateChars(String string1) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>(); 

        for (char ch : string1.toCharArray()) {
            if (seen.contains(ch)) {
                duplicates.add(ch);
            } else {
                seen.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : duplicates) {
            result.append(ch);
        }
        return result.toString();
    }
}
