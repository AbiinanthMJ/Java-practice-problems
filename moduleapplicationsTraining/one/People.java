package moduleapplicationsTraining.one;
import java.util.Arrays;
public class People {
    String name;
    int height;
    int age;
    int character;
    int [] marks;
    public People(String name, int height, int age, int character, int[] marks) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.character = character;
        this.marks = marks;
    }
    public String toString(){
        return STR."This Boys Name is \{this.name}His age is \{this.age} \{this.name}height is \{this.height}Over all his Character is Good \{this.name} has a marks of \{Arrays.toString(this.marks)}";
    }
}
