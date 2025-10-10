package oops.LTIOOPS;

public class Shapes {
    void area(){
        System.out.println("This is the general expression for the area for all the shapes");
    }
    void area(int a , int b){
        System.out.println("The area is "+a+" "+b);
    }
    int n ;
    Shapes(){
        super();
    }


    public static void main(String[] args) {
        Object o = new Shapes();
    }
}
