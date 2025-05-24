package problems;
import java.util.*;
public class D8 {
    public static void main(String[] args) {
        String[] words={"leet","code"};
        char x='e';
        List<Integer>result = new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     for(int j=0;j<words[i].length();j++){
        //         if(words[i].charAt(j)==x){result.add(i);
        //         break;
        //        }
        //     }
        // }
        int i=0;
        while(i<words.length){
            if(words[i].indexOf(x)!=-1){
                result.add(i);
            }
            i++;
        }
        System.out.println(result);
    }
}
