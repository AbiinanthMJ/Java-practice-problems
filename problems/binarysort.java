class reverseasentense   {
    public static  void main(String[] args) {
        reverseASentence("hello this is me");
    }
    private static void reverseASentence(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
