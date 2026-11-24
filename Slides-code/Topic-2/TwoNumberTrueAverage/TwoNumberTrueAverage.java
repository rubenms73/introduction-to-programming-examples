import java.util.Scanner;

/**
 * Reads two int values and displays their real average.
 */
public class TwoNumberTrueAverage
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Two integers: ");
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        double average = ((double) number1 + number2) / 2;
        System.out.printf("Average: %.1f\n", average);
        keyboard.close();
    }
}
