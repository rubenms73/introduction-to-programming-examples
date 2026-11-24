import java.util.Scanner;

/**
 * Applies the Kaprekar routine to a four-digit number until it reaches
 * 6174.
 */
public class KaprekarRoutine
{
    /**
     * Reads the number and prints each step of the routine and the number
     * of steps.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Four-digit number: ");
        int number = keyboard.nextInt();

        if (number < 1000 || number > 9999 || allDigitsEqual(number))
            System.out.println("Invalid number");
        else
        {
            int steps = 0;
            while (number != 6174)
            {
                int descending = descendingDigits(number);
                int ascending = reverseFourDigits(descending);
                number = descending - ascending;
                steps++;
                System.out.printf("%04d - %04d = %04d%n", descending, ascending, number);
            }
            System.out.println("Steps: " + steps);
        }
        keyboard.close();
    }

    /**
     * Decides whether the four digits of a number are equal. The routine
     * does not work for numbers such as 1111.
     *
     * @param number a four-digit number
     * @return true if the four digits are equal, false otherwise
     */
    public static boolean allDigitsEqual(int number)
    {
        int digit = number % 10;
        for (int i = 0; i < 4; i++)
        {
            if (number % 10 != digit)
                return false;
            number = number / 10;
        }
        return true;
    }

    /**
     * Builds the number with the four digits in descending order.
     *
     * @param number a number with at most four digits
     * @return the digits of number sorted from largest to smallest
     */
    public static int descendingDigits(int number)
    {
        // Take the four digits, leading zeros included, from 9 down to 0.
        int result = 0;
        for (int digit = 9; digit >= 0; digit--)
        {
            int copy = number;
            for (int i = 0; i < 4; i++)
            {
                if (copy % 10 == digit)
                    result = result * 10 + digit;
                copy = copy / 10;
            }
        }
        return result;
    }

    /**
     * Reverses the four digits of a number, leading zeros included.
     *
     * @param number a number with at most four digits
     * @return the number with its four digits reversed (4310 gives 134)
     */
    public static int reverseFourDigits(int number)
    {
        int result = 0;
        for (int i = 0; i < 4; i++)
        {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }
}
