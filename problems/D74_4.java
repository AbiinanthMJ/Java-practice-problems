package problems;

import java.util.Arrays;

public class D74_4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        while(arr.length>1)
        {
            int [] temp = new int[arr.length-1];
            for(int idx=0;idx<temp.length;idx++) {
                temp[idx] = (arr[idx] + arr[idx + 1]) % 10;
            }
            arr=temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
