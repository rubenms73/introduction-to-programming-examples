import java.util.Scanner;

public class MatrixProduct
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("First matrix");
        int[][] a = readMatrix(keyboard);
        System.out.println("Second matrix");
        int[][] b = readMatrix(keyboard);

        int[][] product = multiply(a, b);
        if (product == null)
            System.out.println("The product cannot be calculated");
        else
            printMatrix(product);
        keyboard.close();
    }

    public static int[][] readMatrix(Scanner keyboard)
    {
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();
        int[][] matrix = new int[rows][columns];

        System.out.println("Values, row by row:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = keyboard.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] multiply(int[][] a, int[][] b)
    {
        // The columns of a must match the rows of b.
        if (a[0].length != b.length)
            return null;

        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                for (int k = 0; k < b.length; k++)
                {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
