public class Q62 {
    public static void main(String[] args) {
        String str = "abc#d#e#f";
        String result = moveHash(str);
        System.out.println(result);
    }

    public static String moveHash(String str) {
        StringBuilder hash = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') hash.append('#');
            else other.append(c);
        }
        return hash.append(other).toString();
    }
}
