package oops.inheritance;

import oops.inheritance.BoxWeight;

public class Boxprize extends BoxWeight {

    Boxprize(double l, double h, double w, double weight) {
        super(l, h, w, weight);
    }
     boolean printnboxprize(){
        System.out.println(this.h);
        System.out.println(this.l);
        System.out.println(this.w);
        System.out.println(this.weight);
         return false;
     }
}
