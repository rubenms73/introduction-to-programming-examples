import java.util.Scanner;

/**
 * Adds two integer matrices with the same dimensions.
 */
public class SumMatrices
{
    public static int[][] readIntMatrix(Scanner keyboard)
    {
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.print("Components: ");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = keyboard.nextInt();
            }
        }
        return matrix;
    }

    public static void printIntMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[][] matrix1 = readIntMatrix(keyboard);
        int[][] matrix2 = readIntMatrix(keyboard);

        int[][] sum = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < sum.length; i++)
        {
            for (int j = 0; j < sum[i].length; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printIntMatrix(sum);
        keyboard.close();
    }
}
