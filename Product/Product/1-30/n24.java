package vh;
import java.util.Scanner;

public class n24 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        
        System.out.print("The square of first " + n + " natural numbers are ");
        int i = 1;
        while (i <= n) {
            System.out.print((i * i));
            if (i != n) System.out.print(", ");
            i++;
        }

        System.out.println(); 

        System.out.print("The cube of first " + n + " natural numbers are ");
        int j = 1;
        while (j <= n) {
            System.out.print((j * j * j));
            if (j != n) System.out.print(", ");
            j++;
        }

        sc.close();
    }
}

    

