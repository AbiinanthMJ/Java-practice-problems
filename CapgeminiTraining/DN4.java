package CapgeminiTraining;

public class DN4 {

    public static void main(String[] args) {
        DN4 o = new DN4();
        String s = "babad";
        String[] maxsubstring={""};
        int maxlength=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(o.isplaindrome(s.substring(i,j))){
                   if(s.substring(i,j).length()>maxlength){
                       maxsubstring[0]=s.substring(i,j);
                       maxlength=s.substring(i,j).length();
                   }
                }
            }
        }
        System.out.print(maxsubstring[0]);

    }
    boolean isplaindrome(String s){
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
