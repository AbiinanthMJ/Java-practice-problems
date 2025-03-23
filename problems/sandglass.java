package problems;

public class sandglass {
    public static void main(String[] args) {
     int n=9;
       for(int i=0;i<n;i++){
           for(int k=0;k<i;k++){
               System.out.print("  ");
           }
           for(int j=n-i;j>=1;j--){
                   System.out.print(j+" ");
           }
           for(int j=2;j<=n-i;j++){
               System.out.print(j+" ");
           }
           System.out.println("");
       }
    }
}
