import java.util.Scanner;

public class Q36TyreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of dealerships: ");
        int n = scanner.nextInt();
        int[] cars = new int[n];
        int[] bikes = new int[n];
        int totalTyres = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dealership " + (i + 1) + ":");
            System.out.print("Number of cars: ");
            cars[i] = scanner.nextInt();
            System.out.print("Number of two-wheelers: ");
            bikes[i] = scanner.nextInt();
            int tyres = (cars[i] * 4) + (bikes[i] * 2);
            System.out.println("Total tyres in Dealership " + (i + 1) + ": " + tyres);
            totalTyres += tyres;
        }

        System.out.println("Total number of tyres across all dealerships: " + totalTyres);
        scanner.close();
    }
}

