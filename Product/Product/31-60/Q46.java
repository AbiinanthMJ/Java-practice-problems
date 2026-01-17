public class Q46 {
    static boolean isArmstrong(int N) {
        int temp = N, sum = 0, digits = String.valueOf(N).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == N;
    }

    public static void main(String[] args) {
        System.out.println("Is 153 Armstrong? " + isArmstrong(153)); // true
    }
}
