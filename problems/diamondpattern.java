package problems;

import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int left_pointer=n-1;
        int right_pointer=n+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+n+1;j++){
                if(i==0 && j==n){
                        System.out.print("  ");
                }
                else if(j>left_pointer&&j<right_pointer){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            left_pointer--;
            right_pointer++;
            System.out.println();
        }
        left_pointer=0;
        right_pointer=n+n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+n+1;j++){
                if(i==5 && j==n){
                    System.out.print("  ");
                }
                else  if(j>left_pointer&&j<right_pointer){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            left_pointer++;
            right_pointer--;
            System.out.println();
        }
    }
}
