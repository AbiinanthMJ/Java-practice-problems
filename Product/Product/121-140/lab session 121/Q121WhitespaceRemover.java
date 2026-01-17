import java.util.*;
public class Q121WhitespaceRemover {
    public static String truncate(String input1) {
        
        return input1.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        String s=c.nextLine();
        System.out.println(truncate(s));
        c.close();  
    }}