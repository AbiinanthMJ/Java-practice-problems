package oops.Abstract;
public class Child<T> extends Parent<T> {

    public Child(T age) {
        super(age);
    }
    @Override
    void rulesofparenting() {
        System.out.println("Follow the parent's guidance and learn well!");
    }
}
