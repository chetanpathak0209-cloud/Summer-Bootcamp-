
class NegativeEvenRowsSwap {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        
        for (int i = 1; i < rows; i += 2) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = -matrix[i][j];
            }
        }

        
        int[] temp = matrix[1];
        matrix[1] = matrix[3];
        matrix[3] = temp;

        System.out.println("Matrix after making even rows negative and swapping:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
