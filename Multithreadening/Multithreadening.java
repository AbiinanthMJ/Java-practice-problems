package Multithreadening;
public class Multithreadening {
    public static void main(String[] args) {
        copying copying;
        copying = new copying();
        Print print = new Print();
        copying.run();
        print.run();
    }
}
