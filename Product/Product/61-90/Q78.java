public class Q78 {
    public static void main(String[] args) {
        int a = 54, b = 24;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
