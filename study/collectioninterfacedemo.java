package study;
import java.util.*;
public class collectioninterfacedemo {
    public static void main(String[] args) {
        Collection<String> s1 = new ArrayList<String>();
        s1.add("hello");
        s1.add("word");
        Collection<String> s2 = new HashSet<>();
        s2.add("a");
        s2.add("b");
        s2.add("c");
        s2.add("d");
        s2.add("e");
        System.out.println(s1);
        System.out.println(s2);
//        addAll is the one using to in one place
        s2.addAll(s1);
        System.out.println(s2);
    }
}
