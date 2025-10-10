package oops.ArrayList.generics;

public class student implements Comparable<student>{
    String name;
    float mark;
    public student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }
    public int compareTo(student o) {
        return (int)(this.mark-o.mark);
    }

    @Override
    public String toString() {
        return STR."student{name='\{name}\{'\''}, mark=\{mark}\{'}'}";
    }
}
