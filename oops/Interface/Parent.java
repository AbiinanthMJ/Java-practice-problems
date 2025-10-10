package oops.Interface;

public interface Parent {
    void helper();
    String toString();
//    this is the actual function that we need ;
    void career();
}
class Child implements  Parent{

    @Override
    public void helper() {
        System.out.println("I am here to help you in child class");
    }

    @Override
    public void career() {
        System.out.println("I am here from the career function in child class ");
    }
}
