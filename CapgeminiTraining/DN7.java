package CapgeminiTraining;

import java.util.ArrayList;

public class DN7 {
    public static void main(String[] args) {
        String word = "catsanddog";
        ArrayList<String> listofwords = new ArrayList<>();
        listofwords.add("cats");
        listofwords.add("cat");
        listofwords.add("and");
        listofwords.add("dog");

        StringBuilder clean = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (char c : word.toCharArray()) {
            clean.append(c);
            if (listofwords.contains(clean.toString())) {
                ans.append(clean).append(" ");
            }
        }
        System.out.println("Segmented words: " + ans);
    }
}
