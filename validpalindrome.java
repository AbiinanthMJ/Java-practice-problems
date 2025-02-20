import java.lang.String;
public class validpalindrome {
    public static boolean main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder append = new StringBuilder();
        String[] specialchar = new String[]{","," ", ":"};
        for (int i=0;i<s.length();++i){
            int l=0;
            int r=s.length()-1;
            while(l<r){
                while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                    ++l;
                }
                while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                    --r;
                }
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                ++l;
                --r;

            }
        }
        return  true ;
    }
}
