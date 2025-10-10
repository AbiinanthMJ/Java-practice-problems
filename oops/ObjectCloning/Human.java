package oops.ObjectCloning;

public class Human implements Cloneable {
    String name ;
    int age;
    int [] arr ;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{1,2,3,4};
    }

    public Human(Human otherhuman) {
        this.age=otherhuman.age;
        this.name=otherhuman.name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
// This cloneable is made in native that's in c++;
}

