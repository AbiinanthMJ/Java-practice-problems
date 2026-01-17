
import java.util.*; 
public class Problem91 {
    public static void main(String[] args) {
        char[] name = {'a', 'A', 'z', 'Z'};
        printUniqueConsonants(name);
    }

    static void printUniqueConsonants(char[] arr) {
        Set<Character> uniqueConsonants = new java.util.HashSet<>();

        for (char ch : arr) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) == -1) {
                    uniqueConsonants.add(lower);
                }
            }
        }

        System.out.println("Number of unique consonants = " + uniqueConsonants.size());
    }
}
