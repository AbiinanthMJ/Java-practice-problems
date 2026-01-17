package vh;

import java.util.Scanner;

public class n11 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a%100==0){
            System.out.println("equal to Zero:"+a);
        }else{
            System.out.println("Not equal to Zero:"+a);
        }
    }
}
