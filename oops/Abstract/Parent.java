package oops.Abstract;
import java.util.Arrays;

public abstract class Parent<T> {
    T age;
    public Parent(T age) {
        this.age = age;
    }
    public void printheage() {
        System.out.println("This is the n from the parent " + this.age);
    }
    abstract void rulesofparenting();
}

