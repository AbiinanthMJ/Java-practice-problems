public class Problem60 {
    public static void main(String[] args) {
        String str = "dqwd";
        printPattern(str);
    }
    static void printPattern(String word) {
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        for (int j = 0; j <= i; j++) {
            System.out.print(ch);
        }
        System.out.print(" ");
    }
}

}
