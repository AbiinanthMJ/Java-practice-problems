package vh;
import java.util.Scanner;
public class n22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        System.out.print("The first " + n + " natural numbers are ");
        int i = 1;
        for ( ; i <= n; i++) {
            if (i != n)
                System.out.print(i + ", ");
            else
                System.out.print(i + ".");
        }
        sc.close();
    }
}

    

