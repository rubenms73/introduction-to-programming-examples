import java.util.Scanner;

/**
 * Reads two integers from 0 to 1000 and displays their integer average.
 */
public class TwoNumberAverage
{
    /**
     * Reads the two numbers and displays their integer average.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Two integers (0..1000): ");
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int average = (number1 + number2) / 2;
        System.out.printf("Integer average: %d\n", average);
        keyboard.close();
    }
}
