import java.util.*;

public class Q127GoKeywordChecker {
    private static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
        "break","case","continue","default","defer","else","for","func",
        "goto","if","map","range","return","struct","type","var"
    ));

    public static void checkKeyword(String word) {
        String lower = word.toLowerCase();
        if (KEYWORDS.contains(lower)) {
            System.out.println(lower + " is a keyword");
        } else {
            System.out.println(lower + " is not a keyword");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        checkKeyword(sc.next());
        sc.close();
    }
}
