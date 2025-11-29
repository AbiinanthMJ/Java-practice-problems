package problems;

public class DNN01 {
    public static void main(String[] args) {
        String s = "3902";

        while (s.length() !=2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int n1 = s.charAt(i) - '0';
                int n2 = s.charAt(i + 1) - '0';
                int n = (n1 + n2) % 10;
                next.append(n);
            }
            s = next.toString();
        }
        System.out.println(s.charAt(0)==s.charAt(1));

    }
}
