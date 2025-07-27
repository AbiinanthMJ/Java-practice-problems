package oops.Abstractclass;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);//age here is the space for the variable to be stored oky
        // it is taking it from the parent class and allocating it a value from the
        //constructor of the specific class that's been created
        //because parent can also have an age and their children can also have an age
    }
    @Override
    void career(String name, int age) {
        System.out.println(" I will become a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+"he is "+age);
    }
}
