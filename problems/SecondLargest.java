import java.util.Arrays;
public class SecondLargest {
        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};
            int n =arr.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.println("Second Largest value is " + arr[1]);
        }

}
