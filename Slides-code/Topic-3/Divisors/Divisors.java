import java.util.Scanner;

/**
 * Prints the divisors of a positive integer.
 */
public class Divisors
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Positive integer: ");
        int number = keyboard.nextInt();

        for (int divisor = 1; divisor <= number; divisor++)
        {
            if (number % divisor == 0)
                System.out.println(divisor);
        }
        keyboard.close();
    }
}
