public class RotateMatrix180 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Rotated Matrix by 180°:");

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}