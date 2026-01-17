package oops.EnumsPackage;
class Enums extends A{
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }
    public static void main(String[] args) {
        Week week = Week.Monday;
        if(week == Week.Tuesday){
            System.out.println("Yah it is True");
        }
        else{
            System.out.println("It is not True");
        }
    }

}