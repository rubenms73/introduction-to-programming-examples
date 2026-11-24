import java.util.Scanner;

/**
 * Finds the saddle points of a matrix: the values that are the minimum
 * of their row and the maximum of their column.
 */
public class SaddlePoint
{
    /**
     * Reads a matrix and prints its saddle points.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Matrix values, row by row:");
        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                matrix[row][col] = keyboard.nextInt();

        printSaddlePoints(matrix);
        keyboard.close();
    }

    /**
     * Prints each saddle point with its position, or a message if there
     * are none.
     *
     * @param matrix the matrix
     */
    public static void printSaddlePoints(int[][] matrix)
    {
        boolean found = false;

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[row].length; col++)
                if (isMinimumInRow(matrix, row, col) && isMaximumInColumn(matrix, row, col))
                {
                    System.out.printf("Saddle point at (%d, %d): %d%n", row, col, matrix[row][col]);
                    found = true;
                }

        if (!found)
            System.out.println("There is no saddle point");
    }

    /**
     * Decides whether a value is the minimum of its row.
     *
     * @param matrix the matrix
     * @param row the row of the value
     * @param col the column of the value
     * @return true if no value in the row is smaller
     */
    public static boolean isMinimumInRow(int[][] matrix, int row, int col)
    {
        for (int j = 0; j < matrix[row].length; j++)
            if (matrix[row][j] < matrix[row][col])
                return false;
        return true;
    }

    /**
     * Decides whether a value is the maximum of its column.
     *
     * @param matrix the matrix
     * @param row the row of the value
     * @param col the column of the value
     * @return true if no value in the column is greater
     */
    public static boolean isMaximumInColumn(int[][] matrix, int row, int col)
    {
        for (int i = 0; i < matrix.length; i++)
            if (matrix[i][col] > matrix[row][col])
                return false;
        return true;
    }
}
