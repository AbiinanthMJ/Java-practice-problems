package study;

public class generics2 {
    public static   <T,V > void shout (T thingtoshoutone ,V thingtoshouttwo){
        System.out.println(thingtoshoutone+"!!!!!!!!");
        System.out.println(thingtoshouttwo+"!!!!!");
    }
    public static void main(String[] args) {
             shout("this is abiinanth",20);
    }

}
