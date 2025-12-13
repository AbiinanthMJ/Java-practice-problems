package AfterBreakProblemSolving;
class one{
    private int n =10;

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
}
public class access {
    public static void main(String[] args) {
        one one = new one();
        one.setN(10);
        one two = new one();
        two.setN(20);
        int n1 = one.getN();
        int n2 = two.getN();
        System.out.println(n1);
        System.out.println(n2);
    }
}
