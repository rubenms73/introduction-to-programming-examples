import java.util.Scanner;

/**
 * Counts the relative minima of a time series.
 */
public class RelativeMinima
{
    /**
     * Reads the size of an array and then its components.
     *
     * @param keyboard the scanner to read from
     * @return a new array with the values read
     */
    public static double[] readDoubleArray(Scanner keyboard)
    {
        System.out.print("Array size: ");
        int size = keyboard.nextInt();

        double[] values = new double[size];
        System.out.print("Components: ");
        for (int i = 0; i < values.length; i++)
            values[i] = keyboard.nextDouble();
        return values;
    }

    /**
     * Counts the relative minima: the values lower than the previous one
     * and the next one. The first and last values are never minima.
     *
     * @param values the time series
     * @return the number of relative minima
     */
    public static int countRelativeMinima(double[] values)
    {
        int count = 0;
        for (int i = 1; i < values.length - 1; i++)
            if (values[i] < values[i - 1] &&
                    values[i] < values[i + 1])
                count++;
        return count;
    }

    /**
     * Reads a time series and displays its number of relative minima.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double[] values = readDoubleArray(keyboard);
        System.out.printf("Relative minima: %d\n", countRelativeMinima(values));
        keyboard.close();
    }
}
