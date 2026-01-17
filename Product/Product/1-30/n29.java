package vh;

public class n29 {
   

    // Method to print the multiplication table of a number
    void printTable(int n) {
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        // Create object to call the non-static method
        n29 table = new n29();

        // Example input
        int number = 5;
        table.printTable(number);
    }
}


