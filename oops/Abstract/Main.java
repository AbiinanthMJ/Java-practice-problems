package oops.Abstract;
public class Main {
    public static void main(String[] args) {
        Parent<Integer> c = new Child<>(42);
        c.printheage();
        c.rulesofparenting();
    }
}
