package problems;
import java.util.HashMap;

public class permutation {
    public static <Map> void main(String[] args) {
        String s1 ="ab";
        String s2 ="eidbaooo";
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c =s1.charAt(i);
            if(!need.containsKey(c)){
                need.put(c,0);
            }
            else{
                need.put(c,need.get(c)+1);
            }
        }
        System.out.println(need);
        int start=0;
        int end =0;
        while(end<s2.length()){
            char c = s2.charAt(end);
            if(!need.containsKey(c)){
                end=end+1;
                start=end;
                have.clear();
                continue;
            }
            if(!have.containsKey(c)){
                have.put(c,0);
            }
            else{
                have.put(c,have.get(c)+1);
            }
            while(have.get(c)>need.get(c)){
                char startchar=s2.charAt(start);
                have.put(startchar,have.get(startchar)-1);
                start++;
            }
            int size = end-start+1;
            end++;
            if(size<=s1.length()){
//                return true;
            }

        }
//        return false;


    }
}
