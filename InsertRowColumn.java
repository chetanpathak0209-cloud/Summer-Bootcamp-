
class InsertRowColumn {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int[] newRow = {5, 6};
        int[] newCol = {7, 8, 9};

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create new matrix with one extra row and column
        int[][] result = new int[rows + 1][cols + 1];

        // Copy original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        // Insert new row
        for (int j = 0; j < cols; j++) {
            result[rows][j] = newRow[j];
        }

        // Insert new column
        for (int i = 0; i < rows + 1; i++) {
            result[i][cols] = newCol[i];
        }

        System.out.println("Matrix after insertion:");

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < cols + 1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}