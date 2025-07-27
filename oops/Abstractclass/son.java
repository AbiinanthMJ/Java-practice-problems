package oops.Abstractclass;

public class son extends  Parent{

    public son(int age) {
        super(age);
    }
    @Override
    void career(String name , int age) {
        System.out.println(" I will become a "+name);
    }
    @Override
    void partner(String name , int age) {
        System.out.println("I love "+name+"She is "+age);
    }
}
