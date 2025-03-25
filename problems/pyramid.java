package problems;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int k=i+1;k>0;k--){
                System.out.print(k);
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
