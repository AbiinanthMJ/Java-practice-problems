package vh;
import java.util.*;
public class n13 {
    public static void main(String[] args) {
        System.out.println("Enter the no:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        
        if((year %4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap year:"+year);

        }else{
            System.out.println("Not leap year:"+year);
        }
    }
}
