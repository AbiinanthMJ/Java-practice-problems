package study;

public class Z_q2 {
    public static void main(String[] args) {
        int n=5;
        /**
         12345
         51234
         45123
         34512
         23451
         12345 -> sample output
          **/
        for(int i=0;i<=n;i++)
        {
            if(i==0){
                System.out.print("");
            }
            else{
                for(int k=i;k>0;k--){
                    System.out.print(n-k+1);
                }
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
