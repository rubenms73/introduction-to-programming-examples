import java.util.Scanner;

/**
 * Counts the relative minima of a time series.
 */
public class RelativeMinima
{
    public static double[] readDoubleArray(Scanner keyboard)
    {
        System.out.print("Array size: ");
        int size = keyboard.nextInt();

        double[] values = new double[size];
        System.out.print("Components: ");
        for (int i = 0; i < values.length; i++)
        {
            values[i] = keyboard.nextDouble();
        }
        return values;
    }

    public static int countRelativeMinima(double[] values)
    {
        int count = 0;
        for (int i = 1; i < values.length - 1; i++)
        {
            if (values[i] < values[i - 1] &&
                    values[i] < values[i + 1])
                count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double[] values = readDoubleArray(keyboard);
        System.out.printf("Relative minima: %d\n", countRelativeMinima(values));
        keyboard.close();
    }
}
