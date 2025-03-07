public class myprogram {
    public boolean checkvalidpalindrome(){
        String s ="A man, a plan, a canal: Panama";
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                ++l;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                --r;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            ++l;
            --r;
        }
        System.out.print("it is palindrome");
        return false;
    }
    public static void main(String[] args) {
      myprogram obj = new myprogram();
      obj.checkvalidpalindrome();

    }
}
