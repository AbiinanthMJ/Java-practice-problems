package CapgeminiTraining;
import java.util.ArrayList;
import java.util.Iterator;

public class DN3 {

    public static void main(String[] args) {
        DN3 obj = new DN3();
        String s = "aplpamagdcbmbp";
        ArrayList<String> sl = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (obj.isPalindrome(sub)) {
                    sl.add(sub);
                }
            }
        }
        Iterator<String> ll = sl.iterator();
        while (ll.hasNext()) {
                System.out.println(ll.next());

        }
    }
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
