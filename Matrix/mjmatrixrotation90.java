package Matrix;

//      ________________________________________________________________________                                                                      |
//     |  This is a mad way to rotate the 3x3 matrix please don't do thi       |
//     |   I just used to play with this type of swapping method               |
//      ------------------------------------------------------------------------

public class mjmatrixrotation90 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] resultmatrix = new int[3][3];
        for(int nums[] : resultmatrix){
           for( int num : nums){
               System.out.println(num);
           }
        }
//before reversing the corners of the 3x3 matrix
        for (int i = matrix.length-1; i >=0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                resultmatrix[j][i]=matrix[i][j];
            }
        }
//        after reversing the corners of the matrix by swapping method
        for (int i = 0; i < resultmatrix.length; i++) {
            int left = 0, right = resultmatrix[i].length - 1;
            while (left < right) {
                int temp = resultmatrix[i][left];
                resultmatrix[i][left] = resultmatrix[i][right];
                resultmatrix[i][right] = temp;
                left++;
                right--;
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
        for(int nums[] : resultmatrix){
            for( int num : nums){
                System.out.println(num);
            }
        }

    }
}
