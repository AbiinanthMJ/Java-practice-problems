package CapgeminiTraining;

public class DN6 {
    int solve(int p ,int q){
        int value;
        while(q!=0){
            value=p%q;
            p=q;
            q=value;
        }
       return p;
    }
    public static void main(String[] args) {
       DN6 o = new DN6();
        System.out.println( o.solve(4,2));
    }
}
