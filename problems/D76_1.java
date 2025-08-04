package problems;

import java.util.HashMap;

public class D76_1 {
    public static void main(String[] args) {
        int [] fruits ={1,2,3,2,2};//we have to find the longest continuous  subarray;
        int left =0,maxfruitslength=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right =0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){// we can use the if continue to avoid using of a while loop
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
                continue;
            }
            maxfruitslength=Math.max(maxfruitslength,right-left+1);
        }
        System.out.println(maxfruitslength);
    }
}
