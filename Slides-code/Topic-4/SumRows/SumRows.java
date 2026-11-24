import java.util.Scanner;

/**
 * Reads a matrix of real numbers and prints the sum of each row.
 */
public class SumRows
{
    public static float[][] readFloatMatrix(Scanner keyboard)
    {
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();

        float[][] matrix = new float[rows][columns];
        System.out.print("Components: ");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = keyboard.nextFloat();
            }
        }
        return matrix;
    }

    public static float[] sumByRows(float[][] matrix)
    {
        float[] sums = new float[matrix.length];
        for (int i = 0; i < matrix.length; i++)
        {
            sums[i] = sumFloatArray(matrix[i]);
        }
        return sums;
    }

    public static float sumFloatArray(float[] values)
    {
        float sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float[][] matrix = readFloatMatrix(keyboard);
        float[] sums = sumByRows(matrix);
        for (int i = 0; i < sums.length; i++)
        {
            System.out.printf("Row %d: %.2f\n", i, sums[i]);
        }
        keyboard.close();
    }
}
