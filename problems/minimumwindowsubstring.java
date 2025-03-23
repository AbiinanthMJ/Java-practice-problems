package problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class minimumwindowsubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t ="ABC";
//         BANC
        HashMap<Character,Integer> scharcount=new HashMap<>();
        HashMap<Character,Integer> tcharcount=new HashMap<>();
        HashMap<Integer, List<Integer>> storing=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!scharcount.containsKey(s.charAt(i))){
                scharcount.put(s.charAt(i),0);
            }
            else{
                scharcount.put(s.charAt(i),scharcount.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!tcharcount.containsKey(s.charAt(i))){
                tcharcount.put(s.charAt(i),0);
            }
            else{
                tcharcount.put(s.charAt(i),tcharcount.get(s.charAt(i))+1);
            }
        }
        int keycount=0;
        int start =0;
        int end=t.length()-1;
        while(end<s.length()){
          char currentchar = s.charAt(start);
          if(tcharcount.containsKey(start)&&scharcount.containsKey(start)){
//              storing.put(keycount,new ArrayList<>().add(s.charAt(start)));
              keycount++;
             end++;
          }

             end++;
             start=end;
        }

    }
}
