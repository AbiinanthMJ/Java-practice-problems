package vh;
import java.util.*;
public class n6{
    public static void main(String[] args) {
        System.out.println("Enter the no:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b || a<=b && a!=b){
            System.out.println("true");

        }else if(a>b || a>=b || a==b){
            System.out.println("false");
        }
        
        
    }
    
}
