import java.util.Scanner;

public class KaprekarRoutine
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Four-digit number: ");
        int number = in.nextInt();

        if (number < 1000 || number > 9999 || allDigitsEqual(number))
            System.out.println("Invalid number");
        else
        {
            int steps = 0;
            while (number != 6174)
            {
                int descending = sortedNumber(number, true);
                int ascending = sortedNumber(number, false);
                number = descending - ascending;
                steps++;
                System.out.printf("%04d - %04d = %04d%n", descending, ascending, number);
            }
            System.out.println("Steps: " + steps);
        }
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

    public static int sortedNumber(int number, boolean descending)
    {
        int result = 0;

        if (descending)
            for (int digit = 9; digit >= 0; digit--)
            {
                result = appendDigitOccurrences(result, number, digit);
            }
        else
            for (int digit = 0; digit <= 9; digit++)
            {
                result = appendDigitOccurrences(result, number, digit);
            }

        return result;
    }

    public static int appendDigitOccurrences(int result, int number, int digit)
    {
        for (int i = 0; i < 4; i++)
        {
            if (number % 10 == digit)
                result = result * 10 + digit;
            number = number / 10;
        }
        return result;
    }
}
