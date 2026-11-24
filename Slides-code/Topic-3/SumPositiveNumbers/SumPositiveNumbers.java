import java.util.Scanner;

/**
 * Adds positive numbers until the user enters 0.
 */
public class SumPositiveNumbers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        long sum = 0;
        System.out.print("Enter a positive number (0 to finish): ");
        int number = keyboard.nextInt();
        while (number != 0)
        {
            sum += number;
            System.out.print("Enter a positive number (0 to finish): ");
            number = keyboard.nextInt();
        }
        System.out.printf("Sum: %d\n", sum);
        keyboard.close();
    }
}
