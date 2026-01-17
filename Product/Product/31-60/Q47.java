import java.util.Arrays;

public class Q47 {
    static int[] range(int start, int end, int step) {
        int size = (end - start + step - 1) / step;
        int[] result = new int[size];
        for (int i = 0, val = start; val < end; i++, val += step) {
            result[i] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Range(0, 11, 2): " + Arrays.toString(range(0, 11, 2)));
    }
}
