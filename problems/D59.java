package problems;


import java.util.ArrayList;
import java.util.Arrays;

/**
 It contains a minimum of 3 characters.
 It contains only digits (0-9), and English letters (uppercase and lowercase).
 It includes at least one vowel.
 It includes at least one consonant.
 **/
public class D59 {
    public static void main(String[] args) {
        String word = "234Adas";
        int ch = 0, digicount = 0, vowelcount = 0, consonant = 0;
        Boolean condition1 = true;
        Boolean condition2 = false;
        ArrayList<Character> list = new ArrayList<>(
                Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLetter(c)) {
                ch++;
                if (list.contains(c)) {
                    vowelcount++;
                } else {
                    consonant++;
                }
            }

            if (Character.isDigit(c)) {
                int digitValue = c - '0';
                if (digitValue >= 0 && digitValue <= 9) {
                    digicount++;
                } else {
                    condition1 = false;
                }
            }
            if (!Character.isLetterOrDigit(c)) {
                condition1 = false;
            }
        }

        if (word.length() >= 3 && condition1 && vowelcount > 0 && consonant > 0) {
            condition2 = true;
        }

        System.out.println(condition2);
    }
}
