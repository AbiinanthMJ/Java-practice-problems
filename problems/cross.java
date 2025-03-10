package problems;
public class cross {
    public static void main(String[] args) {

                      int count=0;
                      int size=6;
                  int arm2count=1;
                 int arm1count=1;
                for (int i = 0; i <=6; i++) {
                    for (int j = 0; j <=6; j++) {
                        if(i==j && i<=6/2){
                            System.out.print(arm1count++);
                        } else if (i==j && i>6/2) {
                            System.out.print(--arm1count-1);
                        } else if (i ==count&& j==size) {
                            System.out.print(arm2count++);
                            count++;
                            size--;
//                           3,3
                        } else if (i==count+1 && j==size-1) {
                            System.out.print(--arm2count);
                            count++;
                            size--;
                        }
                        System.out.print(" "+"\t");
                    }
                    System.out.println();
                }
    }
}
