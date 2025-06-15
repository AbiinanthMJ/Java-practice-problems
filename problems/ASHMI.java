package problems;

public class ASHMI {
    public static void main(String[] args) {
        String[] A = {
                "   *   ",
                "  * *  ",
                " *   * ",
                "*******",
                "*     *",
                "*     *",
                "*     *"
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        String[] H = {
                "*     *",
                "*     *",
                "*     *",
                "*******",
                "*     *",
                "*     *",
                "*     *"
        };

        String[] M = {
                "*     *",
                "**   **",
                "* * * *",
                "*  *  *",
                "*     *",
                "*     *",
                "*     *"
        };

        String[] I = {
                "*******",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                "*******"
        };
        for (int i = 0; i < 7; i++) {
            System.out.println(A[i] + "  " + S[i] + "  " + H[i] + "  " + M[i] + "  " + I[i]);
        }
    }
}
