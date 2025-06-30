import java.util.Arrays;

public class D47 {
    public static void main(String[] args) {
        int[][] brackets = {{3, 50}, {7, 10}, {12, 25}};
        int income = 10,previousupper=0,upper;
        double sum=0,percentage;
         for(int [] arr : brackets){
               upper = arr[0];
               percentage =arr[1];
               if(upper>income){
                   upper=income;
                   int newupper=upper-previousupper;
                   double taxpercentage = ((newupper * percentage) / 100.0);
                   sum+=taxpercentage;
               }
               else {
                   int newupper=upper-previousupper;
                   previousupper=upper;
                   double taxpercentage = ((newupper * percentage) / 100.0);
                   sum+=taxpercentage;
               }
         }
        System.out.println(sum);

    }
}
