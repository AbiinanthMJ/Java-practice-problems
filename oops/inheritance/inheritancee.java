package oops.inheritance;

public class inheritancee {
    public static void main(String[] args) {
//        Box box = new Box(100,200,300);
//        Box box5 = new BoxWeight(100,200,300,400);
          BoxWeight box7= new BoxWeight(200,300,400,500);
          Boxprize box8 = new Boxprize(2,3,4,5);
//          System.out.println(box8.printnboxprize());

//        System.out.println(box5.l);
//        BoxWeight box6 = new Box(1,2,3);
        //you are only given access to the one in which is in the ref ;
        //we can access a child from a parent not the parent from the child;
        //multiple inheritance is not supported in java okie;
        //abstract classes and interfaces in a seperate video
        /**  hierachial inheritance
          It is basically one class inherit the other class and also many other classes also inherit the same class
           **/
        /**
         Hybird inheritance
         is actually the combination of the single and the multiple inheritance
         But not in java (INTERFACE LETCURE THE CONCEPT IS EXPLAINED;
          **/
        /** the refernence will be in the stack memory but the obj that is
         been created is stored in the heap memory
         the reference will always point to the heap memory the particular object okie**/

         Box.information();
         BoxWeight.information();
    }
}
