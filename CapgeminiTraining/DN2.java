package CapgeminiTraining;
public class DN2 {
    public static void main(String[] args) {
        String s = "aabaababbcaabbcaaabcb";
        String t ="bbc";
        int start=0,end=1;
        while(true){
            if(s.charAt(start)==t.charAt(start)&& end<=t.length()){
                end++;
                if(s.substring(start,end)==t){
                    System.out.println("yes found");
                    break;
                }
            }
            start++;
        }
        System.out.println("Not found");

    }
}
