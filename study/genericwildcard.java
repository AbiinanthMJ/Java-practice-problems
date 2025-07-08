package study;

import java.util.ArrayList;
import java.util.List;

public class genericwildcard {
    public static void main(String[] args) {
        ArrayList<Integer> inlist = new ArrayList<>();
        inlist.add(10);
        printlist(inlist);

    }
    //<?> is called the wild card in which there is no need to print the type of the generics;
    private static void  printlist(List <?> mylist){

    }
}
