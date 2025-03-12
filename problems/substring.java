package problems;
import java.util.HashSet;
import java.util.Set;
public class substring {
    public static void main(String[] args) {
        String s = "abcdab";
        int start = 0;
        int end = 0;
        int maxlength = 0;
        Set<Character> ss = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);
            while (ss.contains(c)) {
                ss.remove(s.charAt(start));
                start++;
            }
            ss.add(c);
            maxlength = Math.max(maxlength, end - start + 1);
            end++;
        }
        System.out.print(maxlength);
    }

}
