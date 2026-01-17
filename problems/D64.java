package problems;
import java.util.ArrayList;
import java.util.Arrays;
public class D64 {
    public static void main(String[] args) {
        String[] s = { "/apple", "/app", "/app/e", "/application", "/apple/pie", "/application/logs"};
        ///app/app/e/apple/apple/pie/application/application/logs
        /**
         /app
         /app/e
         /apple
         /apple/pie
         /application
         /application/logs
         **/
        Arrays.sort(s);//---->this sorts the arr in lexicographically.
        ArrayList<String> list = new ArrayList<>();
        String currString=s[0];
        list.add(currString);
        for(int i=1;i<s.length;i++){
            if(s[i].startsWith(currString+"/")){//i have not hearded about this today i learned about this(startsWith)
                continue;
            }
            else {
                currString=s[i];
                list.add(currString );
            }
        }
        list.stream().forEach(System.out::println);

        //Take aways ----------
        /**
         we can whether a string starts with some thing or not
         we can add the parent in a list and check the next coming one is with the same starting or not thats it
          **/
    }
}

