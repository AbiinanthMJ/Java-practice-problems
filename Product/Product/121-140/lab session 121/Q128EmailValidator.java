import java.util.regex.*;
import java.util.*;
public class Q128EmailValidator {
    

   private static final Pattern EMAIL_PAT = Pattern.compile("^\\S+@\\S+\\.\\S+$");

public static boolean isValidEmail(String s) {
    if (s == null) return false;
    Matcher m = EMAIL_PAT.matcher(s);  
    return m.matches();                
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.println(isValidEmail(email)
            ? email + " is valid"
            : email + " is invalid");
        sc.close();
    }
}

