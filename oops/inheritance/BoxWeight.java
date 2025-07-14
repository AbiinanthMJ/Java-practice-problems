package oops.inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(double l, double h, double w, double weight){
        super(h,l,w);// call the parent constructor and take the value from there
        //calls the parent constructor because the value of the l h w are inilised in the parent
        //so the inilisation should be available in this two okie
        this.weight=weight;
    }
}
