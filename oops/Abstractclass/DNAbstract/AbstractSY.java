package oops.Abstractclass.DNAbstract;

public class AbstractSY {

    abstract class one {
        abstract void fun();
        abstract void fun2();

        void fun3() {
            System.out.println("This can actually have a function Body also ");
        }
    }

    class two extends one {
        @Override
        void fun() {
            System.out.println("I will be good at fun at two class");
        }

        @Override
        void fun2() {
            System.out.println("I will be good at fun2 at two class");
        }
    }

    class three extends one {
        @Override
        void fun() {
            System.out.println("I will be good at fun at three class");
        }

        @Override
        void fun2() {
            System.out.println("I will be good at fun2 at three class");
        }
    }

    public static void main(String[] args) {
        AbstractSY obj = new AbstractSY();

        two t = obj.new two();
        three tr = obj.new three();

        t.fun();
        t.fun2();
        tr.fun();
        tr.fun2();
    }
}
