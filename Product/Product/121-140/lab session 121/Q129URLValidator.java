
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Q129URLValidator {
    private static final Pattern URL_PAT = Pattern.compile(
        "((http|https)://)(www\\.)?[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)"
    );
    public static boolean isValidURL(String s) {
        if (s == null) return false;
        Matcher m = URL_PAT.matcher(s);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = sc.nextLine();
        System.out.println(isValidURL(url) ? "Valid URL" : "Invalid URL");
        sc.close();
    }
}




