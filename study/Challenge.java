package study;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        String s = "aaaabbcccee";
        int [] freq = new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']++;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                char c = (char) (i + 'a');
                String n = String.valueOf(c);
                sb.append(n);
                sb.append(Integer.toString(freq[i]));
            }
        }
        System.out.println(sb.toString());
    }
}
