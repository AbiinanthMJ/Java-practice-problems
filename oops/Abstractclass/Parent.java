package oops.Abstractclass;

public abstract  class Parent {
    int age;
    public Parent (int age){
       this.age=age;
    }
    String name ="Abiinanth";
    abstract void  career(String name , int age);
    abstract void partner(String name , int age);
    static  void print(){
        System.out.print("Hello is from abstract class static method");
    }

}
