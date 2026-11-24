import java.util.Scanner;

/**
 * Displays the percentage change between two values.
 */
public class PercentageVariation
{
    /**
     * Reads the initial and final values and displays the percentage change.
     * Nothing is displayed when the initial value is zero.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Initial and final values: ");
        double initial = keyboard.nextDouble();
        double finalValue = keyboard.nextDouble();

        // Do not divide when the divisor is zero
        if (initial != 0)
        {
            double variation = (finalValue - initial) / initial * 100;
            System.out.printf("Variation: %.2f%%\n", variation);
        }
        keyboard.close();
    }
}
