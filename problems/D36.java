package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D36 {
    public static void main(String[] args) {
        String s = "abcdefghijk";
        int k = 3;
        char fill = 'k';
        List<String> list = new ArrayList<>();
        int indexcount=0;
        for(int i = 0; i < s.length(); i+=k) {
            if (i + k <= s.length()) {
                list.add(s.substring(i, i + k));
                indexcount++;
            }
        }
        int availablecount =0;
        for(String S : list){
            availablecount+=S.length();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(availablecount,s.length()));
        sb.append(s.substring(availablecount, s.length()));
        while (sb.length() > 0 && sb.length() < k) {
            sb.append(fill);
        }

        if (sb.length() > 0) {
            list.add(String.valueOf(sb));
        }
        System.out.println(list);
    }
}
