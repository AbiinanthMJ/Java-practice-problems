package oops.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        try{
//             divide(a,b);
            String name = "Abiinanth";
            if(name.equals("Abiinanth")){
                throw new MyException("My Name is Abiinanth");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (MyException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("this is the final function been called ");
        }

    }
    static int divide (int a , int b) throws ArithmeticException{
        if(b==0){
            throw  new ArithmeticException("Please don't divide with 0");
        }
        return a/b;
    }
}
