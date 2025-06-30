package study;

class one {
    int n1;
    int n2;
    one next;
    one(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    int add() {
        return n1 + n2;
    }
}

public class Actualnodeconcept {
    public static void main(String[] args) {
        one first = null, second = null, third = null, four = null;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                first = new one(i, i + 1);
            } else if (i == 1) {
                second = new one(i, i + 1);
//                second=first;
            } else if (i == 2) {
                third = new one(i, i + 1);
            } else if (i == 3) {
                four = new one(i, i + 1);
            }
        }
        System.out.println("first: " + first.n1+" "+first.n2+" "+"sum of these"+first.add());
        System.out.println("second: " + second.n1+" "+second.n2+" "+"sum of these"+second.add());
        System.out.println("third: " + third.n1+" "+third.n2+" "+"sum of these"+third.add());
        System.out.println("four: " + third.n1+" "+third.n2+" "+"sum of these"+third.add());
    }
}
