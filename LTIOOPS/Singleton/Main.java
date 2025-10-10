package LTIOOPS.Singleton;

public class Main {
    public static void main(String[] args) {
//        singleton o1 = singleton.getinstance(21);
//        o1.printn();
//
//        singleton o2= singleton.getinstance(31);// this will make the reference variable to point to the existing instance that's been created
//        o2.printn();
        SingletonGeneric<Character> o1= SingletonGeneric.getInstance('b');
        int num = (int)o1.getValue();
        System.out.println((char)num-'a');
    }
}
