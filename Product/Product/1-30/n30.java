package vh;
  import java.util.Scanner;
public class n30 {
   


    void printTable(int n) {
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        n30 table = new n30();
        table.printTable(number);

        sc.close();
    }
}


