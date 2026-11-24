import java.util.Scanner;

/**
 * Reads ten real numbers and displays their average.
 */
public class AverageOfTenReals
{
    /**
     * Reads the ten numbers and displays their average.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        for (int counter = 1; counter <= 10; counter++)
        {
            System.out.print("Enter number " + counter + ": ");
            double number = keyboard.nextDouble();
            sum += number;
        }
        double average = sum / 10;
        System.out.printf("Average: %.2f\n", average);
        keyboard.close();
    }
}
