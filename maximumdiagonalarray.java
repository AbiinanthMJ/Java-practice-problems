public class maximumdiagonalarray{
    public static void main(String[] args) {
        // Example 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        System.out.println(n);// Assuming square matrix
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];            // Primary diagonal element
            secondaryDiagonalSum += matrix[i][n - 1 - i];
            System.out.println(matrix[i][n - 1 - i]);// Secondary diagonal element
        }

        int maxDiagonalSum = Math.max(primaryDiagonalSum, secondaryDiagonalSum);
        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
        System.out.println("Maximum Diagonal Sum: " + maxDiagonalSum);
    }
}
