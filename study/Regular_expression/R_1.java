package study.Regular_expression;
import java.util.regex.*;

public class R_1 {
    public static void main(String[] args) {
        String text = "Dog Cat Dog Birds";
        Pattern p = Pattern.compile("Dog");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
