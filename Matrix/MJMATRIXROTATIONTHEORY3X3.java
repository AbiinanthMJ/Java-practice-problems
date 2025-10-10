package Matrix;

//      ________________________________________________________________________                                                                      |
//     |  This is a mad way to rotate the 3x3 matrix please don't do this      |
//     |   I just used to play with this type of swapping method               |
//      ------------------------------------------------------------------------

public class mjmatrixrotationtheory3x3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] resultmatrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (((i == 0) || (j == 0)) || ((i == 2) || (j == 2))) {
                    int temp1 = 2-i;
                    int temp2 = 2-j;
                    resultmatrix[i][j] = matrix[temp1][temp2];
                } else {resultmatrix[i][j] = matrix[i][j];}
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
