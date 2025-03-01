package Matrix;

public class mjmatrixrotation90 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] resultmatrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

            }
        }
//        To print the output with correct indentation
        System.out.print("{ ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==0){System.out.print(resultmatrix[i][j]+" ");}
                else{System.out.print(" "+resultmatrix[i][j]);}
            }
            if(i==matrix.length-1){System.out.println(" }");}
            System.out.println();
        }


    }
}
