public class SaddlePoint {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 5, 9},
                {8, 6, 10},
                {9, 7, 11}
        };

        printSaddlePoints(matrix);
    }

    public static void printSaddlePoints(int[][] matrix) {
        boolean found = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (isMinimumInRow(matrix, row, col)
                        && isMaximumInColumn(matrix, row, col)) {
                    System.out.printf("Saddle point at (%d, %d): %d%n",
                            row, col, matrix[row][col]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("There is no saddle point");
        }
    }

    public static boolean isMinimumInRow(int[][] matrix, int row, int col) {
        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] < matrix[row][col]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMaximumInColumn(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > matrix[row][col]) {
                return false;
            }
        }
        return true;
    }
}
