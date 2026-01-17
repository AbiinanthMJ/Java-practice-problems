import java.util.*;

public class Q124UniqueCharFinder {

    public static Character firstUniqueChar(String str) {

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

       
        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Character result = firstUniqueChar(input);
        if (result != null) {
            System.out.println("First unique character: " + result);
        } else {
            System.out.println("No unique character found.");
        }

        sc.close();
    }
}
