package problems;

import java.util.Arrays;
import java.util.HashMap;

public class D77 {
    public static void main(String[] args) {
        int [] fruits={6,5};
        int [] baskets={3,5};
        int i=0,j=0;
        Boolean[] filled =  new Boolean[baskets.length];
        Arrays.fill(filled,false);
        int np=0;
        while(i<fruits.length){
            if(fruits[i]<=baskets[j]&&!filled[j]){
                filled[j]=true;
                i++;
                j=0;
            }
            if(fruits[i]>baskets[j]&&j<=baskets.length-1){
                j++;
            }
            j=Math.min(j,baskets.length);
        }
        for(Boolean t : filled){
            if(!t) np=np+1;
        }
        System.out.println(np);
    }
}
