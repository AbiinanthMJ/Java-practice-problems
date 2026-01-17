public class Q44 {
    static boolean isPrime(int N) {
        if (N <= 1) return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    static int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Primes from 10 to 50: " + countPrimesInRange(10, 50)); // Output: 10
    }
}
