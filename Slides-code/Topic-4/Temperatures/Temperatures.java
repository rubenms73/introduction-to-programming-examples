import java.util.Scanner;

/**
 * Reads 24 hourly temperatures and displays their maximum and average.
 */
public class Temperatures
{
    public static double average(int[] v)
    {
        long sum = 0;
        for (int i = 0; i < v.length; i++)
        {
            sum += v[i];
        }
        return (double) sum / v.length;
    }

    public static int maximum(int[] v)
    {
        int max = v[0];
        for (int i = 1; i < v.length; i++)
        {
            if (v[i] > max)
                max = v[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] temperatures = new int[24];

        System.out.print("Day temperatures: ");
        for (int i = 0; i < temperatures.length; i++)
        {
            temperatures[i] = keyboard.nextInt();
        }

        System.out.printf("Maximum: %d\n", maximum(temperatures));
        System.out.printf("Average: %.2f\n", average(temperatures));
        keyboard.close();
    }
}
