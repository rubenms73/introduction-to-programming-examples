import java.util.Scanner;

/**
 * Reads a matrix of real numbers and prints the sum of each row.
 */
public class SumRows
{
    /**
     * Reads the number of rows and columns of a matrix and then its
     * components, row by row.
     *
     * @param keyboard the scanner to read from
     * @return a new matrix with the values read
     */
    public static float[][] readFloatMatrix(Scanner keyboard)
    {
        System.out.print("Rows and columns: ");
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();

        float[][] matrix = new float[rows][columns];
        System.out.print("Components: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = keyboard.nextFloat();
        return matrix;
    }

    /**
     * Adds the components of each row of a matrix.
     *
     * @param matrix the matrix
     * @return an array with the sum of each row
     */
    public static float[] sumByRows(float[][] matrix)
    {
        float[] sums = new float[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            sums[i] = sumFloatArray(matrix[i]);
        return sums;
    }

    /**
     * Adds the components of an array.
     *
     * @param values the array
     * @return the sum of the components
     */
    public static float sumFloatArray(float[] values)
    {
        float sum = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i];
        return sum;
    }

    /**
     * Reads a matrix and prints the sum of each row.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float[][] matrix = readFloatMatrix(keyboard);
        float[] sums = sumByRows(matrix);
        for (int i = 0; i < sums.length; i++)
            System.out.printf("Row %d: %.2f\n", i, sums[i]);
        keyboard.close();
    }
}
