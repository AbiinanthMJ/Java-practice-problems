package vh;
import java.util.*;
public class n15 {
    public static void main(String[] args) {
        System.out.println("Enter the no:");
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
         if(weight<0){
            System.out.println("INVALID INPUT");
        } else if(weight==0){
           System.out.println("Time needed is 0 minutes:");
        }
        else if(weight<=2000){
            System.out.println("25 min:");
        }
        else if(weight<=4000){
                System.out.println("35 min:");
        }
        else if(weight<=7000){
                System.out.println("45 min:");
        }else if(weight>7000){
            System.out.println( "OVERLOADED");

        }
        else{
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
