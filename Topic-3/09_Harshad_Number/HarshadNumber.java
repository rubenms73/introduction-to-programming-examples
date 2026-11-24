import java.util.Scanner;

/**
 * Decides whether a positive number is a Harshad number, that is,
 * divisible by the sum of its digits.
 */
public class HarshadNumber
{
    /**
     * Reads the number and says whether it is a Harshad number.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        int number = keyboard.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else
        {
            int sum = sumDigits(number);
            if (number % sum == 0)
                System.out.println("It is a Harshad number");
            else
                System.out.println("It is not a Harshad number");
        }
        keyboard.close();
    }

    /**
     * Adds the digits of a number.
     *
     * @param number a positive number
     * @return the sum of its digits
     */
    public static int sumDigits(int number)
    {
        int sum = 0;
        while (number > 0)
        {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
