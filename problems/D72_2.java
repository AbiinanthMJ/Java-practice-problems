package problems;

public class D72_2 {
    public static void main(String[] args) {
        String s = "AAAA";
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 26 + (s.charAt(i) - 'A' + 1);
            // IT IS CARRY FORWARDING THE VALUE OF THE ANSWER
        }
        System.out.println(ans);
    }
}
