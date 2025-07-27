package oops.Abstractclass;
/**
 we cannot create able to create the object of the
 abstract class
super key word calls the constructor of the parent class
 static methods cannot be over ride
 Also it can b used without any object requirement
 Static methods can be created because we didn't need any object creation in this and also the
 object creation is not allowed in static methods
 You can also have methods with body content as well
 silly thing that you cannot have a final abstract class in case of any scenario
 because it wanted to be inherited
 **/
public class interface_opp {
    public static void main(String[] args) {
        son son = new son(20);
        son.career("Doctor",20);
        son.partner("Ashmi",20);
        Daughter daughter = new Daughter(20);
        daughter.career("Lawyer",18);
        daughter.partner("Abiinanth",18);
        Parent.print();
    }
}
