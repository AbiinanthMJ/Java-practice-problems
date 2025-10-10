package LTIOOPS.Singleton;

public class singleton {
     int n ;
     private singleton(int n){
        this.n=n;
     }
     public void printn(){
         System.out.println(n);
     }
     // private stuffs can be only accessed inside the file that's been created
     static  singleton instance ;// so we are creating the reference for the singleton class inside the class itself
     public  static singleton  getinstance(int n ){
         if(instance==null){
             instance = new singleton(n);
             System.out.println("The first object of the class is been created inside the class ");
         }
         return instance;//so the get instance is return the object for the reference which we created outside the singleton class
         //since it is static the get instance can be accessed without the object is been created
     }
}
