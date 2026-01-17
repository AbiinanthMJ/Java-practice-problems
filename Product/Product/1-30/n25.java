package vh;
   import java.util.Scanner;
public class n25 {
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.print("Sum of first " + n + " natural numbers = ");

        
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i);
            if (i != n) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);

        sc.close();
    }
}


