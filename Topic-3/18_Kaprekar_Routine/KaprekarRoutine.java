import java.util.Scanner;

public class KaprekarRoutine
{
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
