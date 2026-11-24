import java.util.Scanner;

/**
 * Multiplies two integer matrices.
 */
public class MatrixProduct
{
    public static int[][] readIntMatrix(Scanner keyboard)
    {
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.print("Components: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = keyboard.nextInt();
        return matrix;
    }

    public static void printIntMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.printf(" %d ", matrix[i][j]);
            System.out.println();
        }
    }

    // Returns null if the product cannot be calculated
    public static int[][] multiply(int[][] a, int[][] b)
    {
        if (a[0].length != b.length)
            return null;
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[][] a = readIntMatrix(keyboard);
        int[][] b = readIntMatrix(keyboard);

        int[][] c = multiply(a, b);
        if (c == null)
            System.out.println("The product cannot be calculated");
        else
            printIntMatrix(c);
        keyboard.close();
    }
}
