import java.util.Scanner;

/**
 * Adds the even numbers from 2 up to a number.
 */
public class SumEvenNumbers
{
    /**
     * Reads a number and displays the sum of the even numbers from 2 up to it.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number: ");
        int number = keyboard.nextInt();

        int sum = 0;
        int current = 2;
        while (current <= number)
        {
            sum = sum + current;
            current = current + 2;
        }
        System.out.printf("Sum: %d\n", sum);
        keyboard.close();
    }
}
