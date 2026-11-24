import java.util.Scanner;

/**
 * Reads 24 hourly temperatures and displays their maximum and average.
 */
public class Temperatures
{
    /**
     * Calculates the average of the components of an array.
     *
     * @param v a non-empty array
     * @return the average of the components of v
     */
    public static double average(int[] v)
    {
        long sum = 0;
        for (int i = 0; i < v.length; i++)
            sum += v[i];
        return (double) sum / v.length;
    }

    /**
     * Finds the largest component of an array.
     *
     * @param v a non-empty array
     * @return the largest component of v
     */
    public static int maximum(int[] v)
    {
        int max = v[0];
        for (int i = 1; i < v.length; i++)
            if (v[i] > max)
                max = v[i];
        return max;
    }

    /**
     * Reads the 24 temperatures and displays their maximum and average.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] temperatures = new int[24];

        System.out.print("Day temperatures: ");
        for (int i = 0; i < temperatures.length; i++)
            temperatures[i] = keyboard.nextInt();

        System.out.printf("Maximum: %d\n", maximum(temperatures));
        System.out.printf("Average: %.2f\n", average(temperatures));
        keyboard.close();
    }
}
