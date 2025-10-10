package CapgeminiTraining;

import java.util.ArrayList;

public class DN1 {
    public static void main(String[] args) {
        String s = "(1apple2graphes_1orange2mango)";
        char [] nl={'1','2','3','4','5','6','7','8','9'};
        char [] al={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        ArrayList<Character> nll= new ArrayList<>();
        ArrayList<Character> all= new ArrayList<>();
        ArrayList<Character> sll= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<nl.length;j++){
                if(s.charAt(i)==nl[j]){
                    nll.add(s.charAt(i));
                }
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<al.length;j++){
                if(s.charAt(i)==al[j]){
                    all.add(s.charAt(i));
                    break;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(!nll.contains(s.charAt(i))){
                if(!all.contains(s.charAt(i))){
                    sll.add(s.charAt(i));
                }
            }
        }
        for(char t : nll){
            System.out.print(t);
        }
        System.out.println(" ");
        for(char t : all){
            System.out.print(t);
        }
        System.out.println(" ");
        for(char t : sll){
            System.out.print(t);
        }

    }
}
