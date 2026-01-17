import java.util.Scanner;
class Q136BinaryOnes {
    public static int countOnes(int n) {
        return Integer.bitCount(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Number of 1's in binary: " + countOnes(n));
        sc.close();
    }
}

