package LTIOOPS.Singleton;

public class MyinterfaceCalculator {

    Operation add = (a,b) -> a + b;
    Operation sub = (a,b) -> a - b;
    Operation mul = (a,b) -> a * b;
    Operation division = (a,b) -> a / b;

    public static void main(String[] args) {
        MyinterfaceCalculator calculator = new MyinterfaceCalculator();
        System.out.println(calculator.add.operate(1,3));
        System.out.println(calculator.mul.operate(4,5));
    }
}
