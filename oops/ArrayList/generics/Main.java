package oops.ArrayList.generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        student one = new student("Abiinanth",23);
        student two = new student("Jaisurya",50);
        student three = new student("Kavin", 35);
        student four  = new student("Monisha", 42);
        student five  = new student("Harini", 28);
        student [] arr = {one,two,three,four,five};
        Arrays.sort(arr);
//        if(one.compareTo(two)<0){
//            System.out.println("There is a difference");
//        } // There the object of the one has a seperate mark in that object that we  have created okie
          //        then we are comparing it with the object two which has a seperate instance of mark in that particular object
        for(student t : arr){
            System.out.println(t.toString());
        }
    }
}
