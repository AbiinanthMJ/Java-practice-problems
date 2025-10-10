package oops.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abi = new Human("Abiinanth",21);
        Human twin = (Human)abi.clone();
        twin.arr[0]=100;
        abi.arr[1]=200;
        System.out.println(Arrays.toString(abi.arr));
        System.out.println(twin instanceof  Object);
        System.out.println(Arrays.toString(twin.arr)); //This is shallow copy
        print(1);
    }
    public static <T> void  print(T thingtoprint){
        System.out.println(thingtoprint);
    }
}
