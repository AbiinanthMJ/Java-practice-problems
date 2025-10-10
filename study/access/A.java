package study.access;

public class A {
    int number;
    String s;
    int [] arr;

    public A(int number, String s) {
        this.number = number;
        this.s = s;
        this.arr = new int[number];
    }
    public int getint(){
        return  this.number;
    }
}
