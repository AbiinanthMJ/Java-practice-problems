import java.util.Scanner;

public class Q123DuplicateDigitCounter {
    public static int countDuplicateDigits(int input1) {
        int[] cnt = new int[10];
        int n = Math.abs(input1); 

        while (n > 0) {
            cnt[n % 10]++;
            n /= 10;
        }

        
        int duplicates = 0;
        for (int freq : cnt) {
            if (freq > 1) duplicates++;
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int result = countDuplicateDigits(input);
        System.out.println("Distinct duplicated digits count: " + result);
        sc.close();
    }
}

